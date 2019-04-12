package dao;

import entidades.Cliente;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ClienteDao {

    public void Inserir(Cliente registro) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("clientes.txt", true));
        bw.write(registro.getID() + ","
                + registro.getNome() + ","
                + registro.getRg() + ","
                + registro.getCpf() + ","
                + registro.getCarteiraMotorista());
        bw.flush();
        bw.newLine();
        bw.close();
    }

    public boolean Deletar(int codigoCliente) throws IOException {
        Scanner strInput = new Scanner(System.in);
        String ID, record;

        File tempDB = new File("clientes_temp.txt");
        File db = new File("clientes.txt");

        BufferedReader br = new BufferedReader(new FileReader(db));
        BufferedWriter bw = new BufferedWriter(new FileWriter(tempDB));
        ID = String.valueOf(codigoCliente);
        while ((record = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(record, ",");
            String cod = st.nextToken();
            if (ID.equals(cod)) {
                continue;
            }
            bw.write(record);
            bw.flush();
            bw.newLine();
        }
        br.close();
        bw.close();
        db.delete();
        tempDB.renameTo(db);
        return true;
    }

    public List<Cliente> ListarTodos() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("clientes.txt"));
        String record;
        List<Cliente> lista = new ArrayList<Cliente>();
        while ((record = br.readLine()) != null) {
            Cliente ent = new Cliente();
            StringTokenizer st = new StringTokenizer(record, ",");
            ent.setID(st.nextToken());
            ent.setNome(st.nextToken());
            ent.setRg(st.nextToken());
            ent.setCpf(st.nextToken());
            ent.setCarteiraMotorista(st.nextToken());
            lista.add(ent);
        }
        br.close();
        return lista;
    }

    public void Alterar(Cliente c) throws IOException {
        String record, ID, record2;

        File db = new File("clientes.txt");
        File tempDB = new File("clientes_temp.txt");

        BufferedReader br = new BufferedReader(new FileReader(db));
        BufferedWriter bw = new BufferedWriter(new FileWriter(tempDB));

        ID = String.valueOf(c.getID());

        while ((record2 = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(record2, ",");
            String cod = st.nextToken();
            if (ID.equals(cod)) {
                bw.write(c.getID() + ","
                        + c.getNome() + ","
                        + c.getRg() + ","
                        + c.getCpf() + ","
                        + c.getCarteiraMotorista());
                bw.flush();
                bw.newLine();
                //bw.close();
            } else {
                bw.write(record2);
                bw.flush();
                bw.newLine();
                //bw.close();
            }
        }

        bw.close();
        br.close();
        db.delete();
        tempDB.renameTo(db);
    }
}

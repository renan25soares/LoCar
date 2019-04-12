package dao;

import entidades.Carro;
import entidades.Locacao;
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

public class CarroDao {

    public void Inserir(Carro carro) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("carros.txt", true));
        bw.write(carro.getID() + ","
                + carro.getNome() + ","
                + carro.getMarca() + ","
                + carro.getChassis() + ","
                + carro.getPlaca() + ","
                + carro.getKilometragem() + ","
                + carro.getStatus() + ","
                + carro.getValorLocacao() + ",");
        bw.flush();
        bw.newLine();
        bw.close();

    }

    public List<Carro> ListarTodos() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("carros.txt"));
        String record;
        List<Carro> lista = new ArrayList<Carro>();
        while ((record = br.readLine()) != null) {
            Carro ent = new Carro();
            StringTokenizer st = new StringTokenizer(record, ",");
            ent.setID(st.nextToken());
            ent.setNome(st.nextToken());
            ent.setMarca(st.nextToken());
            ent.setChassis(st.nextToken());
            ent.setPlaca(st.nextToken());
            ent.setKilometragem(st.nextToken());
            ent.setStatus(st.nextToken());
            ent.setValorLocacao(st.nextToken());
            lista.add(ent);
        }
        br.close();
        return lista;
    }

    public Carro BuscarPorId(String codigo) throws IOException {
        String ID, record;
        Carro ent = new Carro();
        Scanner strInput = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new FileReader("carros.txt"));
        ID = codigo;
        while ((record = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(record, ",");
            String cod = st.nextToken();
            if (ID.equals(cod)) {
                ent.setID(st.nextToken());
                ent.setNome(st.nextToken());
                ent.setMarca(st.nextToken());
                ent.setChassis(st.nextToken());
                ent.setPlaca(st.nextToken());
                ent.setKilometragem(st.nextToken());
                ent.setStatus(st.nextToken());
                ent.setValorLocacao(st.nextToken());
            }
        }
        br.close();
        return ent;
    }

    public boolean Deletar(int codigo) throws IOException {
        Scanner strInput = new Scanner(System.in);
        String ID, record;

        File tempDB = new File("carros_temp.txt");
        File db = new File("carros.txt");

        BufferedReader br = new BufferedReader(new FileReader(db));
        BufferedWriter bw = new BufferedWriter(new FileWriter(tempDB));
        ID = String.valueOf(codigo);
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

    public void Alterar(Carro c) throws IOException {
        String record, ID, record2;

        File db = new File("carros.txt");
        File tempDB = new File("carros_temp.txt");

        BufferedReader br = new BufferedReader(new FileReader(db));
        BufferedWriter bw = new BufferedWriter(new FileWriter(tempDB));

        ID = c.getID();

        while ((record2 = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(record2, ",");
            String cod = st.nextToken();
            if (ID.equals(cod)) {
                bw.write(c.getID() + ","
                        + c.getNome() + ","
                        + c.getMarca() + ","
                        + c.getChassis() + ","
                        + c.getPlaca() + ","
                        + c.getKilometragem() + ","
                        + c.getStatus() + ","
                        + c.getValorLocacao() + ",");
                bw.flush();
                bw.newLine();
            } else {
                bw.write(record2);
                bw.flush();
                bw.newLine();
            }
        }
        bw.close();
        br.close();
        db.delete();
        tempDB.renameTo(db);
    }
}

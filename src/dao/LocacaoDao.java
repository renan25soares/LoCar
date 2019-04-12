package dao;

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

public class LocacaoDao {

    public void Inserir(Locacao registro) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("locacao.txt", true));
        bw.write(registro.getID() + ","
                + registro.getCodigoCarro() + ","
                + registro.getCodigoCliente() + ","
                + registro.getDataRetorno() + ",");
        bw.flush();
        bw.newLine();
        bw.close();
    }

    public void Alterar(Locacao c) throws IOException {
        String record, ID, record2;

        File db = new File("locacao.txt");
        File tempDB = new File("locacao_temp.txt");

        BufferedReader br = new BufferedReader(new FileReader(db));
        BufferedWriter bw = new BufferedWriter(new FileWriter(tempDB));

        ID = c.getID();

        while ((record2 = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(record2, ",");
            String cod = st.nextToken();
            if (ID.equals(cod)) {
                bw.write(c.getID() + ","
                        + c.getCodigoCarro() + ","
                        + c.getCodigoCliente() + ","
                        + c.getDataRetorno() + ",");
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

    public List<Locacao> ListarTodos() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("locacao.txt"));
        String record;
        List<Locacao> lista = new ArrayList<Locacao>();
        while ((record = br.readLine()) != null) {
            Locacao ent = new Locacao();
            StringTokenizer st = new StringTokenizer(record, ",");
            ent.setID(st.nextToken());
            ent.setCodigoCarro(st.nextToken());
            ent.setCodigoCliente(st.nextToken());
            ent.setDataRetorno(st.nextToken());
            lista.add(ent);
        }
        br.close();
        return lista;
    }

    public boolean Deletar(int codigo) throws IOException {
        Scanner strInput = new Scanner(System.in);
        String ID, record;

        File tempDB = new File("locacao_temp.txt");
        File db = new File("locacao.txt");

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
}

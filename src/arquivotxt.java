
import java.io.File;
import java.io.IOException;


public class arquivotxt {
 //http://programero.blogspot.com.br/2009/01/manipulando-arquivos-no-java.html
    public void criarArquivos() throws IOException {
        String caminho = "C:\\";
        File file = new File(caminho + "carros.txt");
        if (!file.exists()) {
            System.out.println("arquivo não existe");
            System.out.println("criando arquivo clientes.txt em..." + caminho);
            file.createNewFile();
            System.out.println("arquivo File.txt, criado em" + "caminho");
        }
        
        File file2 = new File(caminho + "clientes.txt");
        if (!file2.exists()) {
            System.out.println("arquivo não existe");
            System.out.println("criando arquivo clientes.txt em..." + caminho);
            file2.createNewFile();
            System.out.println("arquivo File.txt, criado em" + "caminho");
        }
    }
}

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializarEstudantes<Estudante> {
    private String nomeArquivo;

    public SerializarEstudantes(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public void serializar(List<Estudante> lista) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream(nomeArquivo);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(lista);
        } catch (IOException e) {
            System.out.println("Nao foi possivel serializar");
        } finally {
            if (oos != null){
                try {
                    oos.close();
                } catch (IOException e){
                    System.out.println("Erro ao fechar o arquivo");
                }
            }
        }
    }

    public List<Estudante> desserializar() {
        FileInputStream fio = null;
        ObjectInputStream ois = null;
        List<Estudante> listaEstudantes = new ArrayList<Estudante>();

        try {
            fio = new FileInputStream(nomeArquivo);
            ois = new ObjectInputStream(fio);

            listaEstudantes = (List<Estudante>) ois.readObject();
            return listaEstudantes;
        } catch (IOException e){
            System.out.println("Nao foi possivel desserializar");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (ois != null){
                try {
                    ois.close();
                } catch (IOException e){
                    System.out.println("Erro ao fechar o arquivo");
                }
            }
        }

        return null;
    }
}

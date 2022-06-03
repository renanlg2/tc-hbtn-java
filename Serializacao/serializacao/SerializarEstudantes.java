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
        List<Estudante> listaEstudantes = null;
        FileInputStream fio = null;
        ObjectInputStream ois = null;

        try {
            fio = new FileInputStream(nomeArquivo);
            ois = new ObjectInputStream(fio);

            listaEstudantes = (List<Estudante>) ois.readObject();

        } catch (IOException | ClassNotFoundException e){
            System.out.println("Nao foi possivel desserializar");
        } finally {
            if (ois != null){
                try {
                    ois.close();
                } catch (IOException e){
                    System.out.println("Erro ao fechar o arquivo");
                }
            }
        }

        return listaEstudantes;

    }
}

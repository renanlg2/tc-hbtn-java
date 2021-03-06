import java.util.ArrayList;
import java.util.Iterator;

public class Celular {
    private ArrayList<Contato> contatos = new ArrayList<Contato>();

    public int obterPosicaoContato(String nome){

        for (Contato contato : contatos){
            if (contato.getNome().equals(nome)){
                return contatos.indexOf(contato);
            }
        }

        return -1;
    }

    public void adicionarContato(Contato contato){
        if (obterPosicaoContato(contato.getNome()) == -1){
            this.contatos.add(contato);
        } else {
            throw new IllegalArgumentException("Nao foi possivel adicionar contato. Contato jah existente com esse nome");
        }
    }

    public void atualizarContato(Contato contatoAntigo, Contato novoContato){
        if (obterPosicaoContato(contatoAntigo.getNome()) == -1){
            throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato nao existe");
        }

        if (obterPosicaoContato(novoContato.getNome()) != -1 &&
                obterPosicaoContato(novoContato.getNome()) != obterPosicaoContato(contatoAntigo.getNome())){
            throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato jah existente com esse nome");
        }

        this.contatos.set(obterPosicaoContato(contatoAntigo.getNome()), novoContato);
    }

    public void removerContato(Contato contato){
        Iterator<Contato> iteratorContato = this.contatos.iterator();
        boolean contatoEncontrado = false;

        while (iteratorContato.hasNext()){
            Contato contatoAtual = iteratorContato.next();

            if (contatoAtual.getNome().equals(contato.getNome())){
                contatoEncontrado = true;
                iteratorContato.remove();
            }
        }

        if (!contatoEncontrado){
            throw new IllegalArgumentException("Nao foi possivel remover contato. Contato nao existe");
        }
    }

    public void listarContatos(){
        for (Contato contato : this.contatos){
            System.out.println(contato.getNome() + " -> " + contato.getTelefone() + " (" + contato.getTipo() + ")");
        }
    }
}

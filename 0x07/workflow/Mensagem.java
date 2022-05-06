public class Mensagem {
    public String texto;
    public TipoMensagem tipoMensagem;

    public Mensagem(String texto, TipoMensagem tipoMensagem){
        this.texto = texto;
        this.tipoMensagem = tipoMensagem;
    }


    public TipoMensagem getTipoMensagem() {
        return this.tipoMensagem;
    }

    public void setTipoMensagem(TipoMensagem tipoMensagem){
        this.tipoMensagem = tipoMensagem;
    }

    public String getTexto(){
        return this.texto;
    }

    public void setTexto(String texto){
        this.texto = texto;
    }
}

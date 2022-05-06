public class Video {
    private String arquivo;
    private FormatoVideo formatoVideo;

    public Video(String arquivo, FormatoVideo formatoVideo){
        this.arquivo = arquivo;
        this.formatoVideo = formatoVideo;
    }

    public String getArquivo(){
        return this.arquivo;
    }

    public void setArquivo(String arquivo){
        this.arquivo = arquivo;
    }

    public FormatoVideo getFormatoVideo(){
        return this.formatoVideo;
    }

    public void setFormatoVideo(FormatoVideo formatoVideo){
        this.formatoVideo = formatoVideo;
    }
}

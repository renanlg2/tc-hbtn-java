public class PersonagemGame {
    private int saudeAtual;
    private String nome;
    private String status;

    public PersonagemGame(int saudeAtual, String nome){
        setSaudeAtual(saudeAtual);
        setNome(nome);
    }

    public int getSaudeAtual(){
        return saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual){
        this.saudeAtual = saudeAtual;

        if (this.saudeAtual == 0){
            this.status = "morto";
        } else {
            this.status = "vivo";
        }
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        if (nome != "" && nome != null){
            this.nome = nome;
        }
    }

    public String getStatus(){
        return this.status;
    }

    public void tomarDano(int quantidadeDeDano){
        int saudeComDano = getSaudeAtual() - quantidadeDeDano;

        // Se a saude com o dano for negativa, zerar a mesma
        if (saudeComDano >= 0){
            setSaudeAtual(saudeComDano);
        } else {
            setSaudeAtual(0);
        }
    }

    public void receberCura(int quantidadeDeCura){
        int saudeComCura = getSaudeAtual() + quantidadeDeCura;

        if (saudeComCura <= 100){
            setSaudeAtual(saudeComCura);
        } else {
            setSaudeAtual(100);
        }
    }
}

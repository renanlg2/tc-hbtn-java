public class PersonagemGame {
    private int saudeAtual;
    private String nome;

    public int getSaudeAtual(){
        return saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual){
        this.saudeAtual = saudeAtual;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
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

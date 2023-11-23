public class EstadoJogo {

    private String localizacao;
    private int pontosVida;
    private int pontosMana;
    private int nivel;

    public EstadoJogo(String localizacao, int pontosVida, int pontosMana, int nivel) {
        this.localizacao = localizacao;
        this.pontosVida = pontosVida;
        this.pontosMana = pontosMana;
        this.nivel = nivel;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public int getPontosVida() {
        return pontosVida;
    }

    public void setPontosVida(int pontosVida) {
        this.pontosVida = pontosVida;
    }

    public int getPontosMana() {
        return pontosMana;
    }

    public void setPontosMana(int pontosMana) {
        this.pontosMana = pontosMana;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String toString(){
        return "Localização: " + this.localizacao + "\n" +
                "Pontos de Vida: " + this.pontosVida + "\n" +
                "Pontos de Mana: " + this.pontosMana + "\n" +
                "Nível: " + this.nivel;
    }
}

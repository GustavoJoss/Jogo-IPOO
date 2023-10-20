package Player;

public class Personagem {
    private String nomeJogador;
    private int vida;
    private int negritude;
    private int escudo;



    public String getNomeJogador() {
        return nomeJogador;
    }
    public void setNomeJogador(String nomeJogador){
        this.nomeJogador = nomeJogador;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getNegritude() {
        return negritude;
    }

    public void setNegritude(int negritude) {
        this.negritude = negritude;
    }

    public int getEscudo() {
        return escudo;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }
}

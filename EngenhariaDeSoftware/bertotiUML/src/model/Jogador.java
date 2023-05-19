
package model;

public class Jogador {
    private String jogadorNome;
    private int jogadorIdade;
    private String jogadorPosicao;
    private boolean jogadorContratado;

    public Jogador(String jogadorNome, int jogadorIdade, String jogadorPosicao) {
        this.jogadorNome = jogadorNome;
        this.jogadorIdade = jogadorIdade;
        this.jogadorPosicao = jogadorPosicao;
    }
    
    
    public Jogador(){
        this.jogadorContratado = false;
    }
    
    public String getJogadorNome() {
        return jogadorNome;
    }

    public void setJogadorNome(String jogadorNome) {
        this.jogadorNome = jogadorNome;
    }

    public int getJogadorIdade() {
        return jogadorIdade;
    }

    public void setJogadorIdade(int jogadorIdade) {
        this.jogadorIdade = jogadorIdade;
    }

    public String getJogadorPosicao() {
        return jogadorPosicao;
    }

    public void setJogadorPosicao(String jogadorPosicao) {
        this.jogadorPosicao = jogadorPosicao;
    }

    public boolean isJogadorContratado() {
        return jogadorContratado;
    }

    public void setJogadorContratado(boolean jogadorContratado) {
        this.jogadorContratado = jogadorContratado;
    }

    
    
}


package model;

import java.util.*;


public class Clube {
    private String clubeNome;
    private String clubeCampeonato;
    private List<Jogador> jogadores = new LinkedList<Jogador>();

    public Clube(String clubeNome) {
        this.clubeNome = clubeNome;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }
    

    public String getClubeNome() {
        return clubeNome;
    }

    public void setClubeNome(String clubeNome) {
        this.clubeNome = clubeNome;
    }

    public String getClubeCampeonato() {
        return clubeCampeonato;
    }

    public void setClubeCampeonato(String clubeCampeonato) {
        this.clubeCampeonato = clubeCampeonato;
    }
    
          
    public void contratarJogador(Jogador jogador){
        if(jogador.isJogadorContratado()){
            System.out.println("Desculpe mas "+jogador.getJogadorNome()+" Já esta contratado!");
        }
        else{
        jogadores.add(jogador);
        jogador.setJogadorContratado(true);
        }
    }
 
    
    
}

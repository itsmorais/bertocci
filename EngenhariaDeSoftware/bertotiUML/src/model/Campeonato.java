package model;
import java.util.*;


public class Campeonato {
    private String campeonatoNome;
    private boolean campeonatoAberto;
    private List<String> clubes = new LinkedList<>();
    
    

    public Campeonato(String campeonatoNome, boolean campeonatoAberto) {
        this.campeonatoNome = campeonatoNome;
        this.campeonatoAberto = campeonatoAberto;
    }

    
    
    public List listarClubes(){
        System.out.println("Os clubes que participam do compeonato "+campeonatoNome);
        return clubes;
    }
    
    
    
    public void iniciarCampeonato(){
        this.campeonatoAberto = false;
    }

    public String getCampeonatoNome() {
        return campeonatoNome;
    }

    public void setCampeonatoNome(String campeonatoNome) {
        this.campeonatoNome = campeonatoNome;
    }
    
    
    public void incluirClubeNoCampeonato(Clube clube){
        if (campeonatoAberto && clube.getJogadores().size() > 1){
            String clubeNome = clube.getClubeNome();
            clubes.add(clubeNome);
            clube.setClubeCampeonato(this.getCampeonatoNome());
        }else if(!campeonatoAberto){
            System.out.println("Período de incrições Encerrado! "+campeonatoNome+" Em andamento");
        }else{
            System.out.println("Clube sem jogadores!");
        }
        
        
        
    }
    
}


package bertotiuml;
import model.Campeonato;
import model.Clube;
import model.Jogador;

public class BertotiUML {

    public static void main(String[] args) {
        
        // LIBERTADORES
        Campeonato libertadores = new Campeonato("Libertadores da América",true);
        
        // CLUBES
        Clube corinthians = new Clube("Corinthians");
        Clube palmeiras = new Clube("Sociedade esportiva Palmeiras");
        Clube riverPlate = new Clube("River plate");
        Clube bocaJuniors = new Clube("Boca Juniors");
        
        // Jogadores
        Jogador Cassio = new Jogador("Cassio",33,"Goleiro");
        Jogador Roger = new Jogador("Roger Guedes",24,"Atacante");
        Jogador Fagner = new Jogador("Fagner",33,"Lateral-esquerdo");
        Jogador Veiga = new Jogador("Raphael Veiga",25,"Meia");
        Jogador Roni = new Jogador("Rony",27,"Atacante");
        Jogador Ze = new Jogador("Zé Rafael",26,"Volante");
        Jogador Alvarez = new Jogador("Julian Alvarez",22,"Atacante");
        Jogador Mercado = new Jogador("Mercado",33,"Zagueiro");
        Jogador Cruz = new Jogador("Dela-Cruz",35,"Volante");
        Jogador Biro = new Jogador("Biro",18,"Atacante");
        Jogador Natan = new Jogador("Natan Ribeiro",19,"Meio-campo");
        Jogador Wesley = new Jogador("Wesley Luiz",17,"Zagueiro"); 
        Jogador Endrick = new Jogador("Endrick",17,"Atacante");
        Jogador Vinicius = new Jogador("Vinicius Romero",16,"Ponta-esquerda");
        Jogador Weverton = new Jogador("Weverton",20,"Lateral-direito");


        // Tentando incluir clube sem jogadores em campeonato -> Erro!
        libertadores.incluirClubeNoCampeonato(corinthians);
        libertadores.incluirClubeNoCampeonato(palmeiras);
        
        
        // Incluindo jogadores nas equipes
        corinthians.contratarJogador(Cassio);
        corinthians.contratarJogador(Roger);
        corinthians.contratarJogador(Fagner);
        corinthians.contratarJogador(Biro);  
        corinthians.contratarJogador(Natan);
        corinthians.contratarJogador(Wesley);


        
        palmeiras.contratarJogador(Veiga); 
        palmeiras.contratarJogador(Roni);
        palmeiras.contratarJogador(Ze);
        palmeiras.contratarJogador(Endrick);
        palmeiras.contratarJogador(Vinicius);
        palmeiras.contratarJogador(Weverton);

        
        riverPlate.contratarJogador(Alvarez);
        riverPlate.contratarJogador(Mercado);
        riverPlate.contratarJogador(Cruz);

        
        // Tentando contratar jogador já contratado! -> Erro !
        corinthians.contratarJogador(Veiga);
        palmeiras.contratarJogador(Cassio);
        
        // Incluindo clube em campeonato
        libertadores.incluirClubeNoCampeonato(corinthians);
        libertadores.incluirClubeNoCampeonato(palmeiras);
        libertadores.incluirClubeNoCampeonato(riverPlate);

        // Fechando o periodo de inscrições
        libertadores.iniciarCampeonato();
        
        // NÃO POSSO INCLUIR CLUBES -> Erro!
        libertadores.incluirClubeNoCampeonato(bocaJuniors);  
        
        System.out.println(libertadores.listarClubes());
        
           
     
    }
    
}

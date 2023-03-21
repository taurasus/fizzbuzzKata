import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestTennis {
    
    /*
    
    Nos tests :
    
    - Renvoyer le score initialement (love - love)
    - Renvoyer le score d'un joueur
    - Renvoyer quand le jeu est gagnée (won - player name)
    - Savoir s'il y a un gagnant
    - Si le score d'un joueur est de 40 et qu'il gagne alors le jeu est gagnée
    - Si le score des 2 joueurs est de 40 alors il y a tie
    - Lors du tie, le premier joueur qui marque le point gagne l'avantage
    - 
    
     */
    
    
    @Test
    public void test_score_initial_doit_retourner_love_love() {
        // Given
        Game game = new Game();
        // When
        String score = game.getScore();
        // Then
        assertEquals("love-love", score);
    }
}

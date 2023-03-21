import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestTennis {
    
    /*
    
    Nos tests :
    
    
    - Renvoyer le score d'un joueur
    - Renvoyer quand le jeu est gagnée (won - player name)
    - Savoir s'il y a un gagnant
    - Si le score d'un joueur est de 40 et qu'il gagne alors le jeu est gagnée
    - Si le score des 2 joueurs est de 40 alors il y a tie
    - Lors du tie, le premier joueur qui marque le point gagne l'avantage
    - 
    
     */
    
    
    //  - Renvoyer le score initialement (love - love)
    @Test
    public void test_score_initial_doit_retourner_love_love() {
        // Given
        Game game = new Game();
        // When
        String score = game.getScore(0, 0);
        // Then
        assertEquals("love-love", score);
    }

    @Test
    public void test_score_joueur_1_marque_un_point_doit_retourner_15_love() {
        //Given
        Game game = new Game();
        //When
        String score = game.getScore(15, 0);
        //Then
        assertEquals("15-love", score);
    }

    @Test
    public void test_score_joueurs_ont_marque_un_point_doit_retourner_15_15() {
        // Given
        Game game = new Game();
        // When
        String score = game.getScore(15, 15);
        // Then
        assertEquals("15-15", score);
    }

    @Test
    public void test_score_joueur2_marque_un_point_doit_retourner_love_15() {
        // Given
        Game game = new Game();
        // When
        String score = game.getScore(0, 15);
        // Then
        assertEquals("love-15", score);
    }
    
    @Test
    public void test_score_joueur1_marque_deux_points_doit_retourner_30_love() {
        Game game = new Game();
        
        String score = game.getScore(30, 0);
        
        assertEquals("30-love", score);
    }

    @Test
    public void test_score_40_40_doit_retourner_deuce() {
        Game game = new Game();

        String score = game.getScore(40, 40);

        assertEquals("deuce", score);
    }
}

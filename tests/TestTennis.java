import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;

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
    private Game game;

    @Before
    public void set_up(){
        game = new Game();
    }


    @Test
    public void test_score_0_0_doit_retourner_love_love() {
        // When
        String score = game.getScore(0, 0);
        // Then
        assertEquals("love-love", score);
    }

    @Test
    public void test_score_1_0_doit_retourner_15_love() {
        //When
        String score = game.getScore(1, 0);
        //Then
        assertEquals("15-love", score);
    }

    @Test
    public void test_score_1_1_doit_retourner_15_15() {
        // When
        String score = game.getScore(1, 1);
        // Then
        assertEquals("15-15", score);
    }

    @Test
    public void test_score_0_1_doit_retourner_love_15() {
        // When
        String score = game.getScore(0, 1);
        // Then
        assertEquals("love-15", score);
    }
    
    @Test
    public void test_score_2_0_doit_retourner_30_love() {
        
        String score = game.getScore(2, 0);
        
        assertEquals("30-love", score);
    }

    @Test
    public void test_score_3_3_doit_retourner_deuce() {

        String score = game.getScore(3, 3);

        assertEquals("deuce", score);
    }

    @Test
    public void test_score_4_4_doit_retourner_deuce(){
        //When
        String score = game.getScore(4, 4);
        //Then
        assertEquals("deuce", score);
    }

    @Test
    public void test_score_3_4_doit_retourner_40_advantage(){
        // When
        String score = game.getScore(3, 4);
        // Then
        assertEquals("40-advantage", score);
    }
}

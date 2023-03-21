public class Game {

    public String getScore(int scoreJ1, int scoreJ2) {
        
        if(scoreJ1 == 40 && scoreJ2 == 40) {
            return "deuce";
        }
        
        return traduction(scoreJ1) + "-" + traduction(scoreJ2);
    }
    
    
    private String traduction(int score) {
        if (score == 0){
            return "love";
        }
        
        return String.valueOf(score);
    }
}

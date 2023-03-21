public class Game {

    public String getScore(int scoreJ1, int scoreJ2) {
        
        if(scoreJ1 == 3 && scoreJ2 == 3) {
            return "deuce";
        }
        
        return traduction(scoreJ1) + "-" + traduction(scoreJ2);
    }
    
    
    private String traduction(int score) {
        switch (score) {
            case 3:
                return "40";
            case 2:
                return "30";
            case 1:
                return "15";
            default:
                return "love";
        }
    }
}

public class Game {

    public String getScore(int scoreJ1, int scoreJ2) {

        if(scoreJ1 >= 3 && scoreJ2 >= 3){
            if(scoreJ1 == scoreJ2){
                return "deuce";
            }
            else{
                if(scoreJ1 > scoreJ2){
                    return "advantage-" + traduction(scoreJ2);
                }
                return traduction(scoreJ1) + "-advantage";
            }
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

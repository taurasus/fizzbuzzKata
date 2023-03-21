public class Game {

    public String getScore(int scoreJ1, int scoreJ2) {
       
        if (scoreJ1 == 15 && scoreJ2 == 15) {
            return "15-15";
        }
        else if(scoreJ1 == 15){
            return "15-love";
        }
        else if (scoreJ2 == 15) {
            return "love-15";
        }
        else{
            return "love-love";
        }
        
    }
}

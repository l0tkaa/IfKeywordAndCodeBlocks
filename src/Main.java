import static javax.management.Query.and;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int playerPosition = 2;
        String playerName = "Tim";

        int highScore =  calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("The highScore is " + highScore);
        //creating variables to use with calculateScore. do not need to initialize in the method


        displayHighScorePosition(playerName, playerPosition);


        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        System.out.println("The next highScore is " +
        calculateScore(gameOver, score,levelCompleted,bonus));

    }

      public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
          int finalScore = score;
          if(gameOver){
              finalScore += (levelCompleted + bonus);
              finalScore += 1000;
          }
          return finalScore;
      }


    public static void displayHighScorePosition(String playerName, int playerPosition) {
        if (playerPosition ==2){
            System.out.println(playerName + " managed to get into position " + playerPosition+ " on the high score list.");
        }
    }

    public static void calculateHighScorePosition(int playerScore) {
        if(playerScore>= 1000){
            System.out.println("1")
        }else if ((playerScore >=500) and (playerScore <=1000)){
            System.out.println("2")
        }
        else{return(allOtherScores)
        }

    }
    }


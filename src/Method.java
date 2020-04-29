public class Method {

  public static void main (String[] args){
//    boolean gameOver = true;
//    int score = 100;
//    int levelCompleted = 2;
//    int bonus = 100;
//
//    if (gameOver) {
//      int finalScore = score + (levelCompleted * bonus);
//      System.out.println("Final score is: " + finalScore);
//    }
//
//    score = 200;
//    levelCompleted = 4;
//    bonus = 200;
//
//    if (gameOver){
//      int finalScore = score + (levelCompleted * bonus);
//      System.out.println("Second Final Score is: " + finalScore);
//    }
//
//    System.out.println("This is the method Call:  " + calculateScore(false, 100, 2, 100));
//    System.out.println("This is the Second method Call:  " + calculateScore(true, 200, 4, 200));
//  }
//
//  public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
//    int finalScore;
//    if (gameOver){
//    finalScore = score + (levelCompleted * bonus);
//    return finalScore;
//    } else {
//      return -1;
//    }
    int highScorePosition = calculateHighScorePosition(1000);
    displayHighScorePosition("John", highScorePosition);

    highScorePosition = calculateHighScorePosition(500);
    displayHighScorePosition("Jawid", highScorePosition);
  }


  public static void displayHighScorePosition(String playerName, int highScorePosition){
    System.out.println(playerName + "  managed to get into highScorePosition " + highScorePosition);
  }

  public static int calculateHighScorePosition(int playerScore){
    int position = 4;
    if (playerScore >= 1000)
      position = 1;
    else if (playerScore >= 500)
      position = 2;
    else if (playerScore >= 100)
      position = 3;
      return position;
  }
}


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

    System.out.println("This is the method Call:  " + calculateScore(true, 100, 2, 100));
    System.out.println("This is the Second method Call:  " + calculateScore(true, 200, 4, 200));
  }

  public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
    int finalScore;
    if (gameOver){
    finalScore = score + (levelCompleted * bonus);
    } else {
      return -1;
    }
    return finalScore;
  }

}

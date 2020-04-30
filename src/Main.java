public class Main {

  public static void main(String[] args) {
    MegaBytesConverter.printMegaBytesAndKiloBytes(5000);
    MegaBytesConverter.printMegaBytesAndKiloBytes(1024);
    MegaBytesConverter.printMegaBytesAndKiloBytes(2500);

    BarkingDog.shouldWakeUp(true, 1);
    BarkingDog.shouldWakeUp(false, 2);

    System.out.println("Is leap Year? " + LeapYearCalculator.isLeapYear(12));
    System.out.println("Is leap Year? " + LeapYearCalculator.isLeapYear(10000));

    System.out.println(DecimalComparator.areEqualThreeDecimalPlace(-3.1756, -3.175));//true
    System.out.println(DecimalComparator.areEqualThreeDecimalPlace(3.1766, 3.1756));//false
    System.out.println(DecimalComparator.areEqualThreeDecimalPlace(3.1015, 3.1014));//true
    System.out.println(DecimalComparator.areEqualThreeDecimalPlace(-3.123, 3.123));//false
    System.out.println(DecimalComparator.areEqualThreeDecimalPlace(5.1766, 5.1764));//true

    int highScore = calculateScore(true, 800, 5, 100);
    System.out.println(highScore);

    highScore = calculateScore(false, 10000, 8, 200);
    System.out.println(highScore);

   int  highScorePosition = calculateHighScorePosition(1500);
    displayHighScorePosition("Jon", highScorePosition );
    highScorePosition = calculateHighScorePosition(900);
    displayHighScorePosition("Tom", highScorePosition );
    highScorePosition = calculateHighScorePosition(400);
    displayHighScorePosition("Khan", highScorePosition );
    highScorePosition = calculateHighScorePosition(50);
    displayHighScorePosition("Son", highScorePosition );

    // SpeedConverter

    double miles = SpeedConverter.toMilePerHour(10.5);
    System.out.println("Miles = " + miles);
    SpeedConverter.printConversion(11);

// MegaBytesConverter
    MegaBytesConverter.printMegaBytesAndKiloBytes(1026);
    MegaBytesConverter.printMegaBytesAndKiloBytes(512000);
  }

  public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
    if (gameOver) {
      int finalScore = score + (levelCompleted * bonus);
      finalScore += 1000;
      return finalScore;
    }
    return -1;

  }


  public static void displayHighScorePosition(String playerName, int highScorePosition){
    System.out.println(playerName + "managed to get into Position  " + highScorePosition + "  on the high Score table  ") ;
  }

  public static int calculateHighScorePosition(int playerScore){
//    if (playerScore>1000) return 1;
//    if (playerScore>500 && playerScore<1000) return 2;
//    if (playerScore>100 && playerScore<500) return 3;
//    return 4;
    int position = 4;
    if (playerScore>=1000) {
      position = 1;
    }
    else if(playerScore>=500){
      position = 2;
    }

    else if(playerScore>=100){
      position = 3;
    }
    return position;
  }





}

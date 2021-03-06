public class EqualityPrinter {

  public static void main(String[] args) {
    printEqual(1,2,3);
    printEqual(1,1,3);
    printEqual(1,1,1);
    printEqual(1,2,-3);
    printEqual(1,2,2);
    printEqual(3,2,3);
    printEqual(3,3,3);
  }
  public static void printEqual(int num1, int num2, int num3) {
    if (num1 < 0 || num2 < 0 || num3 < 0) {
      System.out.println("Invalid Value");
    }
    else if (num1 == num2 && num2 == num3)  {
      System.out.println("All Numbers are equal");
    }
    else if (num1 == num2 || num3 == num1 || num3 == num2) {
      System.out.println("Neither all are equal or different");
    }
    else  {
      System.out.println("All numbers are different");
    }
  }


  public static boolean isCatPlaying(boolean summer, int temperature) {
    if (summer && temperature >= 25 && temperature <=45) return true;
    return !summer && temperature >= 25 && temperature <= 35;
  }

}

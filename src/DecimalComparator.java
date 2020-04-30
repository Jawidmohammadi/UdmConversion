import java.util.ArrayList;

public class DecimalComparator {
  public static boolean areEqualThreeDecimalPlace(double one, double two) {
    return (int) (Math.pow(10,3) * one) == (int) (Math.pow(10,3) * two);
  }

  public static boolean hasEqualSum(int first, int second, int third) {
    return third == (first + second);
  }

  public static boolean hasTeen(int first, int second, int third) {
    if ((first >=13 && first <=19) || (second >=13 && second <=19) || (third >=13 && third <=19)) {
      return true;
    } return false;
  }
}



public class DecimalComparator {
  public static boolean areEqualThreeDecimalPlace(double one, double two) {
    return (int) Math.pow(10,3) * one == (int) Math.pow(10,3) * two;
  }
}

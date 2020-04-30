public class Converter {

  public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
    if (feet >= 0 && (inches >= 0 && inches <= 12)) {
      double centimeters = ((feet * 12) + inches) / 0.393701;
      System.out.println(feet + " feet " + inches + " inches" + " = " + centimeters + " cm" );
      return centimeters;
    }
    System.out.println("Invalid feet or inches parameters");
    return -1;
  }

  public static double calcFeetAndInchesToCentimeters(double inches) {
    if (inches >= 0) {
      double feet = (int) inches / 12;
      double remainderInches = inches % 12;
      System.out.println(inches + " inches is = " + feet + " feet and " + remainderInches + " inches");
      return calcFeetAndInchesToCentimeters(feet, remainderInches);
    }
    return -1;
  }
}


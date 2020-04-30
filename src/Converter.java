import org.w3c.dom.ls.LSOutput;

public class Converter {

  private static final String INVALID_VALUE_MESSAGE = "Invalid Value!";

  public static void main(String[] args) {
    System.out.println(getDurationString(123, 59));
    System.out.println(getDurationString(3945L));
  }

  public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
    if (feet >= 0 && (inches >= 0 && inches <= 12)) {
      double centimeters = ((feet * 12) + inches) / 0.393701;
      System.out.println(feet + " feet " + inches + " inches" + " = " + centimeters + " cm");
      return centimeters;
    }
    System.out.println("Invalid feet or inches parameters");
    return -1;
  }

  public static double calcFeetAndInchesToCentimeters(double inches) {
    if (inches >= 0) {
      double feet = (int) inches / 12;
      double remainderInches = inches % 12;
      System.out
          .println(inches + " inches is = " + feet + " feet and " + remainderInches + " inches");
      return calcFeetAndInchesToCentimeters(feet, remainderInches);
    }
    return -1;
  }

  public static String getDurationString(long minutes, long seconds) {
    if (minutes >= 0 && (seconds >= 0 && seconds <= 59)) {

      long hour = minutes / 60;
      long remainingMinutes = minutes % 60;

      String hourFormat = hour + "h";
      if (hour < 10) {
        hourFormat = "0" + hourFormat;
      }

      String remainingMinutesFormat = remainingMinutes + "m";
      if (remainingMinutes < 10) {
        remainingMinutesFormat = "0" + remainingMinutesFormat;
      }

      String secondsFormat = seconds + "s";
      if (seconds < 10) {
        secondsFormat = "0" + secondsFormat;
      }
      return hourFormat + " " + remainingMinutesFormat + " " + secondsFormat;
    }
    return INVALID_VALUE_MESSAGE;
  }

  public static String getDurationString(long seconds) {
    if (seconds < 0) {
      return INVALID_VALUE_MESSAGE;
    }
    long minutes = seconds / 60;
    long remainingSeconds = seconds % 60;

    return getDurationString(minutes, remainingSeconds);
  }


}


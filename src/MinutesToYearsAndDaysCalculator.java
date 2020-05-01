public class MinutesToYearsAndDaysCalculator {

  public static void main(String[] args) {
    printYearsAndDays(527040);
  }
  public static void printYearsAndDays(long minutes) {
    if (minutes < 0) {
      System.out.println("Invalid Value");
    } else {
      long day = (minutes / 60) / 24;
      long year = day / 365;
      long remainingDay = day % 365;
      System.out.println(minutes + " min" + " = " + year + " y and " + remainingDay + " d");
    }
  }
}

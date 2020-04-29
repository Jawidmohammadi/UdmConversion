public class PositiveNegativeZero {

  public static void main(String[] args) {
    checkNumber(10);
    checkNumber(0);
    checkNumber(-5);

    printConversion(120);


  }

  public static void checkNumber(int number){
    if (number > 0) {
      System.out.println("Positive");
    }
    else if (number < 0) {
      System.out.println("Negative");
    } else {
      System.out.println("Zero");
    }
  }

  public static long toMilePerHour(double kiloMeter){
    if (kiloMeter < 0){
      return -1;
    }
    else{
      return (long) (kiloMeter * 0.621371);
    }
  }

  public static void printConversion(double kiloMeter){
    if (kiloMeter < 0) {
      System.out.println("invalid value");
    } else {
      System.out.println(kiloMeter + " km/h" + " = " + toMilePerHour(kiloMeter) + " mi/h");
    }
  }
}











// MegaBytes conversion
/*
    if (kiloBytes<0) {
      System.out.println("Invalid Value");
    }
    else {
      int megaBytes = kiloBytes / 1024;
      int remainder = kiloBytes % 1024;
      System.out.println(kiloBytes + " KB = " + megaBytes + " MB " + " and " + remainder + " KB ");
    }
  }*/
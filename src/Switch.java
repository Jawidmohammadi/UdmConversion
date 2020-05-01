public class Switch {

  public static void main(String[] args) {

    char grade = 'e';
    switch (grade) {
      case 'A':
        System.out.println("You are A grade");
        break;
      case 'B':
        System.out.println("You are B grade");
        break;
      case 'C':
        System.out.println("You are C grade");
        break;
      case 'F':
        System.out.println("You are Fail");
        break;
      case 'D': case 'E': case 'G':
        System.out.println(grade +" is not so good");
      default:
        System.out.println("You have just a passing score");
    }


    printDayOfTheWeek(0);
  }

  public static void printDayOfTheWeek(int day) {
    switch (day) {
      case 0:
        System.out.println("Saturday");
        break;
      case 1:
        System.out.println("Sunday");
        break;
      case 2:
        System.out.println("Monday");
        break;
      case 3:
        System.out.println("Tuesday");
        break;
      case 4:
        System.out.println("Wednesday");
        break;
      case 5:
        System.out.println("Thursday");
        break;
      case 6:
        System.out.println("Friday");
        break;
      default:
        System.out.println("Invalid day");
    }

    if (day == 0) {
      System.out.println("IFSaturday");
    } else if (day == 1) {
      System.out.println("IFSunday");
    } else if (day == 2) {
      System.out.println("IFMonday");
    } else if (day == 3) {
      System.out.println("IFTuesday");
    } else if (day == 4) {
      System.out.println("IFWednesday");
    } else if (day == 5) {
      System.out.println("IFThursday");
    } else if (day == 6) {
      System.out.println("IFFriday");
    } else {
      System.out.println("IFInvalid day");
    }

  }
}

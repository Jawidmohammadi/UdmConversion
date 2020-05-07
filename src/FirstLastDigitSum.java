import javax.swing.DefaultListSelectionModel;

public class FirstLastDigitSum {

  public static void main(String[] args) {
    System.out.println(sumFirstAndLastDigit(252));
    System.out.println(sumFirstAndLastDigit(257));
    System.out.println(sumFirstAndLastDigit(0));
    System.out.println(sumFirstAndLastDigit(5));
    System.out.println(sumFirstAndLastDigit(11));
    System.out.println(sumFirstAndLastDigit(-10));
    System.out.println("**********************************");
    System.out.println(getEvenDigitSum(123198756));
    System.out.println(getEvenDigitSum(45629));
}

  public static int sumFirstAndLastDigit(int number) {
//    int lastDigit = number % 10;
//    int sum = 0;
//    if (number < 0)
//      sum = -1;
//    else if (number == 0)
//      sum = 0;
//    else if (number >= 10) {
//      while (true) {
//        sum += lastDigit;
//        number /= 10;
//        sum += number / 10;
//        break;
//      }
//    } else {
//      sum = number + number;
//    }
//    return sum;

//    int lastdigit = number % 10; // extracting the last digit.
//    if (number >= 0) {
//      while (number >= 10) {
//        number /= 10;
//      }
//      return lastdigit + number;
//
//    } else if (number < 0) {
//      return -1;
//    }
//    return lastdigit;
//  }

    // same as above codes
    int lastDigit = number % 10;
    int sum = 0;
    if (number > 0) {
      while (number >= 10) {
        number /= 10;
      }
      sum += number + lastDigit;
    } else if (number < 0 ){
      return -1;
    } else {
      return 0;
    }
    return sum;
  }

  public static int getEvenDigitSum(int number) {
    if (number < 0) {
      return -1;
    }
    int sum = 0;

    while (number > 0) {
      int lastDigit = number % 10;
      if (lastDigit % 2 == 0) {
        sum += lastDigit;
      }
      number /= 10;
    }
    return sum;
  }


  public static boolean hasSharedDigit(int number1, int number2) {
    if  (number1 >= 10 && number1 <= 99 && number2 >= 10 && number2 <= 99) {
      int lastDigit = number1 % 10;
      int lastDigit2 = number2 % 10;
      while (true) {
        number1 /= 10;
        number2 /= 10;
        return lastDigit == lastDigit2 || number1 == number2 || number1 == lastDigit || number2 == lastDigit2 || lastDigit == number2 || lastDigit2 == number1;
      }
    }
    return false;
  }
}


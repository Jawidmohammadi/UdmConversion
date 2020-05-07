import javax.swing.DefaultListSelectionModel;

public class FirstLastDigitSum {

  public static void main(String[] args) {
    System.out.println(sumFirstAndLastDigit(252));
    System.out.println(sumFirstAndLastDigit(257));
    System.out.println(sumFirstAndLastDigit(0));
    System.out.println(sumFirstAndLastDigit(5));
    System.out.println(sumFirstAndLastDigit(11));
    System.out.println(sumFirstAndLastDigit(-10));

    System.out.println(hasSharedDigit(19, 29));
    System.out.println(hasSharedDigit(19, 20));
    System.out.println(hasSharedDigit(81, 19));
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

    int lastdigit = number % 10; // extracting the last digit.
    if (number >= 0) {
      while (number >= 10) {
        number /= 10;
      }
      return lastdigit + number;

    } else {
      return -1;
    }
  }

  public static boolean hasSharedDigit(int number1, int number2) {
    if  (number1 >= 10 && number1 <= 99 && number2 >= 10 && number2 <= 99) {
      int lastDigit = number1 % 10;
      int lastDigit2 = number2 % 10;
      while (true) {
        number1 /= 10;
        number2 /= 10;
        return lastDigit == lastDigit2 || number1 == number2 || number1 == lastDigit || number2 == lastDigit2 || lastDigit == number2 || lastDigit2 == number1
            ;
      }
    }
    return false;
  }
}


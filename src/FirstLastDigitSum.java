import javax.swing.DefaultListSelectionModel;

public class FirstLastDigitSum {

  public static void main(String[] args) {
    System.out.println(sumFirstAndLastDigit(252));
    System.out.println(sumFirstAndLastDigit(257));
    System.out.println(sumFirstAndLastDigit(0));
    System.out.println(sumFirstAndLastDigit(5));
    System.out.println(sumFirstAndLastDigit(11));
    System.out.println(sumFirstAndLastDigit(-10));
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

    } else if (number < 0) {
      return -1;
    }
    return lastdigit;
  }
  }

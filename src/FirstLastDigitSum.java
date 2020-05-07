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

    System.out.println(hasSameLastDigit(23,32,42));
    System.out.println(hasSameLastDigit(1,51,31));
    System.out.println(hasSameLastDigit(45,20,35));
    System.out.println(hasSameLastDigit(19,59,31));
    System.out.println(hasSameLastDigit(49,98,56));

    System.out.println(getGreatestCommonDivisor(12, 30));

    System.out.println("*******************************");



printFactors(-5);
    printFactors(32);
    System.out.println("*******************************");

    System.out.println(isPerfectNumber(6));
    System.out.println(isPerfectNumber(28));
    System.out.println(isPerfectNumber(5));
    System.out.println(isPerfectNumber(10));
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


  public static boolean hasSameLastDigit (int num1,  int num2, int num3) {
    if ((num1 >= 10 && num1 <= 1000) || (num2 >= 10 && num2 <= 1000) && (num3 <= 10 && num3 >= 1000)) {
      int lastDigit1 = num1 % 10;
      int lastDigit2 = num2 % 10;
      int lastDigit3 = num3 % 10;
        return lastDigit1 == lastDigit2 || lastDigit3 == lastDigit1 || lastDigit2 == lastDigit3;
    }
    else return false;
  }


  public static boolean isValid(int number) {
    return number >= 10 && number <= 1000;
  }



  public static int getGreatestCommonDivisor(int first, int second) {
    if (first < 10 || second < 10) return -1;
    int maxNum = (first > second) ? first : second;
    int count = 0;
    for (int i = 1; i < maxNum ; i++) {

      if ((first % i == 0) && (second % i == 0)) {
        count = i;
      }
    }
    return count;
  }


  public static void printFactors(int number) {
    if (number < 1) {
      System.out.println("Invalid Value");
    } else if (number >=1) {
    int factor = number;
    for (int i = 1; i < number ; i++) {
      if (number % i == 0) {
        System.out.println(i);
      }
    }
      System.out.println(number);
    }
  }


  public static boolean isPerfectNumber(int number) {
    int sum = 0;
    if (number < 1) {
      return false;
    }
    else if (number > 1) {
      for (int i = 1; i < number; i++) {
        if (number % i == 0) {
          sum += i;
          if (number == sum) {
            return true;
          }
        }
      }
    }
    return false;
  }


  public static String numberToWords(int number) {
    if (number < 0) return "Invalid Value";

  }
}



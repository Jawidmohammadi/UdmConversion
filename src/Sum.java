public class Sum {

  public static void main(String[] args) {
    System.out.println("Sum of digits 124 is = " + sumDigits(124));
  }

  private static int sumDigits(int number) {
    if (number < 10) {
      return -1;
    }

    int sum = 0;

    while (number > 0) {
      // extract the least significant number
      int digit = number % 10;
      sum += digit;

      //drop the least significant number
      number /= 10;
    }
    return sum;
  }
}

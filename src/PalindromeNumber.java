public class PalindromeNumber {

  public static void main(String[] args) {
    System.out.println(isPalindrome(45054));
    System.out.println(isPalindrome(102));
    System.out.println(isPalindrome(456979654));
  }

  public static boolean isPalindrome(int number) {
    int reversed = 0;
    int lastDigit = 0;
    int original = number;
    while (number > 0) {
      lastDigit = number % 10;
      reversed = reversed * 10 + lastDigit;
      number /= 10;
    }
    return original == reversed;
  }
}

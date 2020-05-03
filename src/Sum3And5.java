import javax.swing.JFormattedTextField;

public class Sum3And5 {

  public static void main(String[] args) {
    int count = 0;
    int sum = 0;
    for (int i = 1; i <= 1000; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        count++;
        sum += i;
        System.out.println(i);
      }
      if (count == 5) {
        break;
      }
    }
    System.out.println(sum);
    System.out.println("**************************");

    System.out.println(sumOdd(1, 100));
    System.out.println(sumOdd(-1, 100));
    System.out.println(sumOdd(100, 100));
    System.out.println(sumOdd(13, 13));
    System.out.println(sumOdd(100, -100));
    System.out.println(sumOdd(100, 1000));

    for (int i = 0; i < 7; i++) {
      System.out.println(i);
    }
  }


  public static boolean isOdd(int number) {
    if (number < 0) {
      return false;
    } else if (number % 2 != 0) {
      return true;
    } else {
      return false;
    }
  }

  public static int sumOdd(int start, int end) {
    int sum = 0;

    if (start > 0 && end >= start) {
      for (int i = start; i <= end; i++) {
        if (isOdd(i)) {
          sum += i;
        }
      }
      return sum;
    }
    return -1;
  }


}

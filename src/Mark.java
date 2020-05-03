import org.w3c.dom.ls.LSOutput;

public class Mark {

  public static void main(String[] args) {
    System.out.println(isEvenNumber(45680));

    int number = 4;
    int finishNumber = 20;
    int count = 0;
    while (number <= finishNumber) {
      number++;
      if (!isEvenNumber(number)) {
        continue;
      }
      System.out.println("Even number " + number);
      count++;
      if (count >= 5) {
        break;
      }
    }
    System.out.println("Total even numbers found = " + count);

    
  }



  public static boolean isEvenNumber(int number) {
    return number % 2 == 0;
  }


}

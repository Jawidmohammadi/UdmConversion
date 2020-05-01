public class AreaCalculator {

  public static void main(String[] args) {
    area(5);
    area(4,5);
    area(8);
    area(6, 2);
  }

  private static final String AREA_MESSAGE = "The Area of this rectangle is: ";
  public static double area(double radius) {
    if (radius < 0) return -1;
    double area = Math.pow(radius,2) * Math.PI ;
    System.out.println(AREA_MESSAGE + area);
    return area;
  }


  public static double area(double x, double y) {
    if (x < 0 || y < 0) return -1;
    double area = x * y;
    System.out.println(AREA_MESSAGE + area);
    return area;
  }
}

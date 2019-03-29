package basics;

public class MethodOverloading {
    public static void main(String[] args) {
        // System.out.println("Area of rectangle: " + area(14.25d, 10.65d));
        // System.out.println("Area of square: " + area(5));
        System.out.println("1+2=" + sum(1, 2));
        System.out.println("1+2.5=" + sum(1, 2.5f));
        System.out.println("1.3+2.3=" + sum(1.30, 2.3));

    }

    /*  public static double area(double length, double width){

          return length * width;
      }


      public static double area(double side){

          return side * side;
      }

      public static int area(int side){

          return side * side;
      }*/
    public static int sum(int x, int y) {
        System.out.println("Adding 2 int entities");
        return x + y;
    }

    public static double sum(double x, double y) {
        System.out.println("Adding 2 double entities");
        return x + y;
    }

}

import java.util.Scanner;
import shapes.*;

public class U5_L4_Activity_Three
{

  public static double circDiff(Circle a, Circle b) {
    double aCircumference = a.getCircumference();
    double bCircumference = b.getCircumference();
    double c = Math.abs(aCircumference - bCircumference);
    return c;
  }

  // You can uncomment and add to the main method to test your code
  // You will need to remove/comment out this method before submitting your code
  
  /*
  public static void main(String[] args){
    Circle c1 = new Circle(8);
    Circle c2 = new Circle(2.5);
    double difference = circDiff(c1, c2);
    System.out.print(difference);
  }
  */
}

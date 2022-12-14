import java.util.Scanner;
import shapes.*;

public class U5_L4_Activity_One
{

  public static int totalSides(RegularPolygon a, RegularPolygon b) {
    int polyOneSides = a.getNumSides();
    int polyTwoSides = b.getNumSides();
    int allSides = polyOneSides + polyTwoSides;
    return allSides;
  }

  // You can uncomment and add to the main method to test your code
  // You will need to remove/comment out this method before submitting your code
  /*
    public static void main(String[] args){
    RegularPolygon poly1 = new RegularPolygon(4, 6.0);
    RegularPolygon poly2 = new RegularPolygon(8);
    int c = totalSides(poly1, poly2);
    System.out.print(c);
  }
  */
}

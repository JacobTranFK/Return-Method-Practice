import java.util.Scanner;

public class U5_L4_Activity_Two
{

  public static double distance(int x, int y, int x2, int y2) {
    double dist = Math.sqrt(Math.pow((double)(x2-x),2) + Math.pow((y2-y),2));
    return dist;
  }

  // You can uncomment and add to the main method to test your code
  // You will need to remove/comment out this method before checking your code for a score
  
  /*
  public static void main(String[] args){
    double d = distance(0, 5, 0, 0);
    System.out.println(d);
  }
  */
}

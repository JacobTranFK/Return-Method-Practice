import java.util.Scanner;

public class U5_L4_Activity_Four
{

  public static int substringCount(String a, String b) {
    int count = 0;
    int totalString = a.length();
    int current = 0;
    int counterMax = b.length();
    while(counterMax <= totalString) {
      if(a.substring(current, counterMax).equals(b)) {
        count++;
      }
      current++;
      counterMax++;
    }
    return count;
  }

/*
  public static void main(String[] args){
    int subCount = 0;
    subCount = substringCount("aabbababababaaa", "aa");
    System.out.println(subCount);
  }
*/
}

/*
if(a.substring(current, counterMax).equals(b)) {
        count++;
      } 
      counterMax++;
      current++;
*/    

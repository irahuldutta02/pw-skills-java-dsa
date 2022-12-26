// Q2 - Swap two numbers without the use of third variable.
// Input: 5 10
// Output: 10 5
import java.util.Scanner;

public class Q2 {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter 1st number");
    int x = scn.nextInt();
    System.out.println("Enter 2nd number");
    int y = scn.nextInt();
    x = x + y;
    y = x - y;
    x = x - y;
    System.out.println(x);
    System.out.println(y);
    scn.close();
  }
}

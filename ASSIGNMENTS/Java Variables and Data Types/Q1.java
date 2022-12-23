// Q1 - Take 2 integer values in two variables x and y and print their product.
import java.util.Scanner;

public class Q1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input 1st Number: ");
    int a = sc.nextInt();
    System.out.println("Input 2nd Number: ");
    int b = sc.nextInt();
    System.out.println("Product of " + a + " and " + b + " is = " + (a * b));
    sc.close();
  }
}

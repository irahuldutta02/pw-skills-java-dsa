// Q4 - Write a program to print positive number entered by the user, if user enters a negative
// number, it IS skipped
// Sample Input : Enter an integer: -6
// Sample Output : The number is negative and skipped

import java.util.Scanner;

public class Q4 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x;
    System.out.print("Enter the Number : ");
    x = sc.nextInt();
    if (x >= 0) {
      System.out.print("You entered a positive number");
    } else {
      System.out.print("You number is negative and is skipped");
    }
  }
}

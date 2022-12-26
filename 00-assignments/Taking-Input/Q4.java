// Q4 - Given two numbers, return their sum in the following format:
// Int t representing number of test cases
// T lines of Two integers representing the numbers to be added

import java.util.Scanner;

public class Q4 {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int t = scn.nextInt();
    for (int i = 1; i <= t; i++) {
      int a = scn.nextInt();
      int b = scn.nextInt();
      System.out.println(a + b);
    }
    scn.close();
  }
}

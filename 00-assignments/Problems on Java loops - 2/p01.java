// Q1 - Write a program to print Fibonacci series of n terms where n is input by user.
// Input:
// 6
// Expected Output:
// 1 1 2 3 5 8


import java.util.Scanner;
public class p01 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input n : ");
    int n = sc.nextInt();
    int a = 1;
    int b = 1;

    for (int i = 1; i < n; i++) {
      System.out.println(a + " ");
      int sum = a + b;
      a = b;
      b = sum;
    }
  }
}

import java.util.Scanner;

// Q3- Write a program to calculate the factorial of a number.
// Input:
// 5
// Expected Output:
// 120

public class p03 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input : ");
    int n = sc.nextInt();
    int ans = 1; //initialize with 1 as factorial of 0 and 1 both is 1
    for (int i = 2; i <= n; i++) {
      ans *= i; //keep multiplying numbers in the current product till you reach n
    }
    System.out.println(ans);
  }
}

import java.util.Scanner;

public class p3 {

  //     Given an integer n, return the first n rows of Pascal's triangle.
  // In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

  //print 2d array
  static void print2dArrays(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print("[ ");
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.print("]");
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] p = new int[n][];

    for (int i = 0; i < n; i++) {
      p[i] = new int[i + 1];
      p[i][0] = p[i][i] = 1;
      
      //important j=1
      for (int j = 1; j < i; j++) {
        p[i][j] = p[i - 1][j] + p[i - 1][j - 1];
      }
    }

    print2dArrays(p);
  }
}

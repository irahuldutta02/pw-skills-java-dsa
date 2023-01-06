import java.util.Scanner;

// Given a matrix 'a' of dimension n x m and 2 coordinates (11, rl) and (12, r2).
// Return the sum of the rectangle from (ll,rl) to (12, r2).

public class p01 {

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

  // taking 2d array input
  static int[][] create2dArray() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input Number rows : ");
    int n = sc.nextInt();
    System.out.println("Input Number columns : ");
    int m = sc.nextInt();
    int[][] arr = new int[n][m];

    System.out.println("Input " + m * n + " array elements : ");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        arr[i][j] = sc.nextInt();
      }
    }
    return arr;
  }

  static int findSum(int[][] arr, int l1, int r1, int l2, int r2) {
    int sum = 0;
    for(int i = l1;i<=l2;i++){
      for(int j = r1;j<=r2;j++){
        sum += arr[i][j];
      }
    }

    return sum;
  }

  public static void main(String[] args) {
    int[][] arr = create2dArray();
    print2dArrays(arr);

    Scanner sc = new Scanner(System.in);
    System.out.println("Rectangle boundaries  l1 r1 l2 r2 : ");
    int l1 = sc.nextInt();
    int r1 = sc.nextInt();
    int l2 = sc.nextInt();
    int r2 = sc.nextInt();

    System.out.println("Rectangle Sum : "+findSum(arr, l1, r1, l2, r2));
  }
}

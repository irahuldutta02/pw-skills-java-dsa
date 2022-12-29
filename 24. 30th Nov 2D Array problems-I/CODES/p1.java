import java.util.Scanner;

public class p1 {

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

  //transpose of matrix
  static int[][] transposeof2dArray(int[][] arr) {
    int r = arr.length;
    int c = arr[0].length;
    int[][] arr2 = new int[c][r];

    for (int i = 0; i < c; i++) {
      for (int j = 0; j < r; j++) {
        arr2[i][j] = arr[j][i];
      }
    }

    return arr2;
  }

  //transpose of matrix in Place (only works for squre matrix)
  static void transposeof2dArrayInPlace(int[][] arr) {
    int r = arr.length;
    int c = arr[0].length;

    for (int i = 0; i < c; i++) {
      // very important (i)
      for (int j = i; j < r; j++) {
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
      }
    }
  }

  public static void main(String[] args) {
    int arr[][] = create2dArray();

    System.out.println("Transpose of the array is creating new array:");

    print2dArrays((transposeof2dArray(arr)));
    transposeof2dArrayInPlace(arr);

    System.out.println("Transpose of the array in place : ");

    print2dArrays(arr);
  }
}

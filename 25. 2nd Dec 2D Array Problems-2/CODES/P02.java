import java.util.Scanner;

public class P02 {

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

  static int[][] createSpiralArray(int n) {
    int tR = 0, bR = n - 1, lC = 0, rC = n - 1, tE = 0;
    int ele = 1;
    int[][] arr = new int[n][n];

    while (tE < n * n) {
      // toprow -> leftcol to rightcol
      for (int j = lC; j <= rC; j++) {
        arr[tR][j] = ele++;
        tE++;
      }
      tR++;
      // rightcol -> toprow to bottomrow
      for (int i = tR; i <= bR; i++) {
        arr[i][rC] = ele++;
        tE++;
      }
      rC--;

      // bottomrow -> rightcol to leftcol
      for (int j = rC; j >= lC; j--) {
        arr[bR][j] = ele++;
        tE++;
      }
      bR--;

      // leftcol -> bottomrow to toprow
      for (int i = bR; i >= tR; i--) {
        arr[i][lC] = ele++;
        tE++;
      }
      lC++;
    }

    return arr;
  }

  public static void main(String[] args) {
    System.out.println("Input n : ");
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int arr[][] = createSpiralArray(n);

    print2dArrays(arr);
  }
}

import java.util.Scanner;

// print 2d array in spirat order
public class P01 {

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

  // print spiral matrix

  static void printSpiralOrder(int[][] arr, int r, int c) {
    int tR = 0, bR = r - 1, lC = 0, rC = c - 1, tE = 0;

    while (tE < r * c) {
      // toprow -> leftcol to rightcol
      for (int j = lC; j <= rC && tE < r * c; j++) {
        System.out.print(arr[tR][j] + " ");
        tE++;
      }
      tR++;
      // rightcol -> toprow to bottomrow
      for (int i = tR; i <= bR && tE < r * c; i++) {
        System.out.print(arr[i][rC] + " ");
        tE++;
      }
      rC--;

      // bottomrow -> rightcol to leftcol 
      for (int j= rC;j<=lC && tE<r*c;j--){
        System.out.print(arr[bR][j]+" ");
        tE++;
      }
      bR--;

      // leftcol -> bottomrow to toprow 
      for(int i=bR;i<=tR && tE< r*c;i-- ){
        System.out.print(arr[i][lC]+" ");
        tE++;
      } 
      lC++;
      
    }
  }

  public static void main(String[] args) {
    int[][] arr = create2dArray();

    print2dArrays(arr);
    System.out.println();
    printSpiralOrder(arr, arr.length, arr[0].length);
  }
}

import java.util.Scanner;

public class p2 {
  //     Given a square matrix, turn it by 90 degrees in a clockwise direction
  // without using any extra space.
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


  static void reverseArray (int[] arr){
    int i = 0, j = arr.length-1;

    while(i<j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
    }

  }

  static int[][] rotate2dArray(int[][] arr){
    int[][] arr2 = transposeof2dArray(arr);
    //important arr2.length
    for(int i =0; i<arr2.length;i++){
        reverseArray(arr2[i]);
    }
    
    return arr2;
  }
 

  public static void main(String[] args) {
    int arr[][] = create2dArray();


    System.out.println("Original array : ");
    print2dArrays(arr);

    System.out.println("90 deg Rotated array is : ");
    print2dArrays((rotate2dArray(arr)));
  }

}

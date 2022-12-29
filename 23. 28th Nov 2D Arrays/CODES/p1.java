import java.util.Scanner;

public class p1 {

    //print 2d array
    static void print2dArrays(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < arr[i].length; j++) {
              System.out.print(arr[i][j] + " ");
            }
            System.out.print(" ]");
            System.out.println();
          }
    }

    // taking 2d array input
    static int[][] create2dArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Number rows : ");
        int n = sc.nextInt();
        System.out.println("Input Number columns : ");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
    
        System.out.println("Input " + m*n + " array elements : ");
        for (int i = 0; i < n; i++) {
          for (int j = 0; j < m; j++) {
            arr[i][j] = sc.nextInt();
          }
        }
        return arr;
    }

  public static void main(String[] args) {

    int[][] arr = create2dArray();
    int[][] arr2 = create2dArray();

    print2dArrays(arr);
    print2dArrays(arr2);

    
  }
}

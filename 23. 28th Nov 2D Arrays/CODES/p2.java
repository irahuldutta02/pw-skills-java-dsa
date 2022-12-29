import java.util.Scanner;

public class p2 {

    //print 2d array
    static void print2dArrays(int[][] arr){
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

    // add 2d arrays

    static void add2dArray(int[][] arr1, int[][] arr2){
        int r1 = arr1.length;
        int c1 = arr1[0].length;
        int r2 = arr2.length;
        int c2 = arr2[0].length;
        int[][] ansArr = new int[r1][c1];
        if (r1!=r2 || c1!=c2){
            System.out.println("Not Possible.");
        } else{
            for(int i = 0; i<r1;i++){
                for(int j =0; j<c1; j++){
                    ansArr[i][j] = arr1[i][j]+arr2[i][j];
                }
            }
            print2dArrays(ansArr);
        }
        
    }

    public static void main(String[] args) {

        System.out.println("First array --- ");
        int[][] arr = create2dArray();
        System.out.println("Second array ---");
        int[][] arr2 = create2dArray();
    
        System.out.println("Addition of these 2 arrays in matrix form is - " );
        add2dArray(arr, arr2);
      }
    
}

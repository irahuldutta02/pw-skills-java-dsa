import java.util.Scanner;

// Write a program to display Multiplication of two matrices entered by the user.

public class p3 {
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

    // multiply 2d arrays

    static void mul2dArray(int[][] arr1, int[][] arr2){
        int r1 = arr1.length;
        int c1 = arr1[0].length;
        int r2 = arr2.length;
        int c2 = arr2[0].length;
        int[][] ansArr = new int[r1][c2];
        if (c1!=r2){ 
            System.out.println("Not Possible.");
        } else{
            for(int i = 0; i<r1;i++){
                for(int j =0; j<c2; j++){
                    for (int k =0; k<c1;k++){
                        ansArr[i][j] += arr1[i][k]*arr2[k][j];
                    }
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

        System.out.println("Multiplication of these 2 arrays in matrix form is - " );
        mul2dArray(arr, arr2);
    }
}

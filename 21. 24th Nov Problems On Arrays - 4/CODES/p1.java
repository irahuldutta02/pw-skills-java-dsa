import java.util.Scanner;

public class p1{

//     Given an integer array 'a', return the prefix sum/running sum in the same array without
//     creating a new array.

    public static int[] prefixSum(int[] arr){
        int n = arr.length;
        int[] pref

    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Input " + n + " array element : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
    }
}
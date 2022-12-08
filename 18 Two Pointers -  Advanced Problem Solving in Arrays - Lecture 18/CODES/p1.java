import java.util.Arrays;
import java.util.Scanner;

public class p1 {
    // short an array containing only 0's and 1's
    static void shortAnArrayWith01(int[] arr) {
        int n = arr.length;
        int zeros = 0;
        for(int i = 0; i<n;i++){
            if(arr[i]==0){
                zeros++;
            }
        }
        for (int i =0; i<n;i++){
            if (i<zeros){
                arr[i] =0;
            }else {
                arr[i]=1;
            }
        }
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
        // short an array containing only 0's and 1's
        shortAnArrayWith01(arr);
        System.out.println("Shorted array : "+Arrays.toString(arr));
    }
}

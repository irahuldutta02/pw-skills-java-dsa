import java.util.Arrays;
import java.util.Scanner;

public class p2 {
    //   swap in array
    static void swapInArray(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // short an array containing only 0's and 1's
    // 2nd approach same as p1
    static void shortAnArrayWith01(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1;
        while (left < right) {
            if(arr[left] == 1 && arr[right] == 0 ){
                swapInArray(arr, left, right);
                left++;
                right--;
            }
            if(arr[left]==0){
                left++;
            }
            if (arr[right]==1){
                right--;
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
        // 2nd approach same as p1
        shortAnArrayWith01(arr);
        System.out.println("Shorted array : " + Arrays.toString(arr));

    }
}

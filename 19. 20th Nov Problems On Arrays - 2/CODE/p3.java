import java.util.Arrays;
import java.util.Scanner;

public class p3 {
    //    Rotate the given array 'a' by k steps, where k is non-negative Note: k can be greater than n as well. // ( Not space optimized )
    static int[] rotateArr(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        int[] ans = new int[n];
        int j = 0;
        for (int i = n - k; i < n; i++) {
            ans[j++] = arr[i];
        }
        for (int i = 0 ; i< n-k ; i++){
            ans[j++] = arr[i];
        }
        return ans;
    }

    //    Rotate the given array 'a' by k steps, where k is non-negative Note: k can be greater than n as well. // ( Space optimized )

    //    swap in array
    static void swapInArray(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //Reverse an array consisting of integer values. (swap)
    static void reversedArr3(int[] arr, int i, int j) {
        while (i < j) {
            swapInArray(arr, i, j);
            i++;
            j--;
        }
    }
    static int[] rotateArr2(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
       reversedArr3(arr, 0, n-k-1);
       reversedArr3(arr, n-k, n-1);
       reversedArr3(arr, 0, n-1);
        return arr;
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

        //    Rotate the given array 'a' by k steps, where k is non-negative Note: k can be greater than n as well.
        System.out.print("Input K : ");
        int k = sc.nextInt();
        // ( Not space optimized )
        System.out.println("Rotated array is ( Not space optimized ) : " + Arrays.toString(rotateArr(arr, k)));
        // ( Space optimized )
        System.out.println("Rotated array is ( Space optimized ) : " + Arrays.toString(rotateArr2(arr, k)));
        sc.close();

    }
}

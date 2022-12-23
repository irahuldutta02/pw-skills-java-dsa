//Given an array of integers 'a', move all the even integers at the
//        beginning of the array followed by all the odd integers. The
//        relative order of odd or even integers does not matter. Return
//        any array that satisfies the condition.


import java.util.Arrays;
import java.util.Scanner;

public class p3 {
    //   swap in array
    static void swapInArray(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void shortOddEven(int[] arr){
        int n = arr.length;
        int left = 0, right = n - 1;
        while (left < right) {
            if((arr[left] % 2 != 0) && (arr[right] % 2 == 0) ){
                swapInArray(arr, left, right);
                left++;
                right--;
            }
            if(arr[left] % 2 == 0){
                left++;
            }
            if (arr[right] % 2 != 0){
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

        shortOddEven(arr);
        System.out.println("Shorted odd even array : " + Arrays.toString(arr));
    }
}

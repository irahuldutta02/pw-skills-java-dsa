import java.util.Arrays;
import java.util.Scanner;

public class p2 {

  //     Given an integer array 'arr', return the prefix sum/running sum in the same array without
  //     creating a new array.
  public static void prefixSum(int[] arr) {
    int n = arr.length;
    for (int i = 1; i < n; i++) {
        arr[i] += arr[i-1];
    }
  }

  public static void main(String[] args) {
    // taking a array input 
    Scanner sc = new Scanner(System.in);
    System.out.print("Input array size : ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.print("Input " + n + " array element : ");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    //     Given an integer array 'arr', return the prefix sum/running sum of the array
    prefixSum(arr);
    System.out.println("Prefix Sum : " + Arrays.toString(arr));
    sc.close();
  }
}

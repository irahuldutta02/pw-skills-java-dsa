import java.util.Scanner;

public class p4 {

  // Check if we can partition the array into two subarrays with equal sum. More
  // formally, check that the prefix sum of a part of the array is equal to the suffix
  // sum of rest of the array.

  //total sum of a array
  static int findtotalSum(int[] arr) {
    int ans = 0;
    for (int i = 0; i < arr.length; i++) {
      ans += arr[i];
    }
    return ans;
  }

  //equalSumPartition
  static boolean equalSumPartition(int[] arr) {
    int totalSum = findtotalSum(arr);
    int prefixSum = 0;
    for (int i = 0; i < arr.length; i++) {
      prefixSum += arr[i];
      if (prefixSum == (totalSum - prefixSum)) {
        return true;
      }
    }
    return false;
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

    System.out.println("Equalsum Possibility is : " + equalSumPartition(arr));

    sc.close();
  }
}

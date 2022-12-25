import java.util.Scanner;

public class p3 {

  //     Given an array of integers of size n. Answer q queries where you need to print the sum
  //     of values in a given range of indices from l to r (both included).
  //     Note: The values of l and r in queries follow 1-based indexing.

  // prefix sum
  public static int[] prefixSum(int[] arr) {
    int n = arr.length;
    int[] pref = new int[n];
    pref[0] = arr[0];

    for (int i = 1; i < n; i++) {
      pref[i] = pref[i - 1] + arr[i];
    }
    return pref;
  }

  public static void main(String[] args) {
    // taking a array input
    // one base indexing input
    Scanner sc = new Scanner(System.in);
    System.out.print("Input array size : ");
    int n = sc.nextInt();
    int[] arr = new int[n + 1];
    System.out.print("Input " + n + " array element : ");
    for (int i = 1; i <= n; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.print("Input Q : ");
    int q = sc.nextInt();

    while (q-- > 0) {
      System.out.print("Input L : ");
      int l = sc.nextInt();
      System.out.print("Input R : ");
      int r = sc.nextInt();

      System.out.println(
        //calling prefix sum for arr
        "Ans : " + ((prefixSum(arr)[r]) - (prefixSum(arr)[l - 1]))
      );
    }
    sc.close();
  }
}

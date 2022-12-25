import java.util.Scanner;

public class p2 {

  // max value
  static int maxValue(int[] arr) {
    int max = Integer.MIN_VALUE;
    for (int j : arr) {
      if (j > max) {
        max = j;
      }
    }
    return max;
  }

  // second largest element
  static int secondMaxValue(int[] arr) {
    int max = Integer.MIN_VALUE;
    max = maxValue(arr);
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == max) {
        arr[i] = Integer.MIN_VALUE;
      }
    }
    return maxValue(arr);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter The size of array : ");
    int n = sc.nextInt();

    int[] arr = new int[n];
    System.out.println("Enter " + n + " elements : ");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }

    //max value
    System.out.println("Max value : " + maxValue(arr));
    // second max value
    System.out.println("Second max value : " + secondMaxValue(arr));
    sc.close();
  }
}

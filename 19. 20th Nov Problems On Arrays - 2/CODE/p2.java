import java.util.Arrays;
import java.util.Scanner;


public class p2 {
    //Reverse an array consisting of integer values. (for loop)
    static int[] reversedArr(int[] arr) {
        int[] arr2 = new int[arr.length];
        int j = 0;
        for (int i = (arr.length - 1); i >= 0; i--) {
            arr2[j++] = arr[i];
        }

        return arr2;
    }

    //Reverse an array consisting of integer values. (while loop)
    static int[] reversedArr2(int[] arr) {
        int[] arr2 = new int[arr.length];
        int i = (arr.length - 1), j = 0;
        while (i >= 0) {
            arr2[j++] = arr[i--];
        }
        return arr2;
    }

    //    swap in array
    static void swapInArray(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //Reverse an array consisting of integer values. (swap)
    static void reversedArr3(int[] arr) {
        int i = 0, j = (arr.length-1);
        while (i < j) {
            swapInArray(arr, i, j);
            i++;
            j--;
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

        //Reverse an array consisting of integer values. (for loop)
        System.out.println("Reversed array with for loop is : " + Arrays.toString(reversedArr(arr)));
        //Reverse an array consisting of integer values. (while loop)
        System.out.println("Reversed array with while loop is : " + Arrays.toString(reversedArr2(arr)));
        //Reverse an array consisting of integer values. (swap)
        reversedArr3(arr);
        System.out.println("Reversed array using swap is : " + Arrays.toString(arr));
        sc.close();
    }


}

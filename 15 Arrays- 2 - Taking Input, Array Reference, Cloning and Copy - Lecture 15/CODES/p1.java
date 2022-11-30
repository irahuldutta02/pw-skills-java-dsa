import java.util.Scanner;

public class p1 {
    // count the number of occurrence of a particular element x.
    static int countOccurrence(int[] arr, int x) {
        int count = 0;
        for (int j : arr) {
            if (j == x) {
                count++;
            }
        }
        return count;
    }

    // Find the last occurrence of an element x in a given array.
    static int lastOccurrence(int[] arr, int x) {
        int lastIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    // Count the number of elements strictly greater than value x.
    static int strictlyGreater(int[] arr, int x) {
        int strictlyGreater = 0;
        for (int j : arr) {
            if (j > x) {
                strictlyGreater++;
            }
        }
        return strictlyGreater;
    }

    // Check if the given array is sorted or not.
    static boolean isShorted(int[] arr) {
        boolean check = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                check = false;
                break;
            }
        }
        return check;
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

        System.out.println("Enter x : ");
        int x = sc.nextInt();

        // count the number of occurrence of a particular element x.
        System.out.println("Count of " + x + " is : " + countOccurrence(arr, x));

        // Find the last occurrence of an element x in a given array.
        int lastOccurrence = lastOccurrence(arr, x);
        if (lastOccurrence == -1) {
            System.out.println(x + " Not Found.");
        } else {
            System.out.println("Last occurrence of " + x + " is : " + lastOccurrence);
        }

        // Count the number of elements strictly greater than value x.
        System.out.println("Strictly greater count of " + x + " is : " + strictlyGreater(arr, x));

        // Check if the given array is sorted or not.
        boolean check = isShorted(arr);

        if (!check){
            System.out.println("The array is not shorted.");
        }else{
            System.out.println("The array is shorted.");
        }

    }
}

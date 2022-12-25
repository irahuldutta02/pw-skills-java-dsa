import java.util.Scanner;

public class p1 {
    //    Program to find the total number of pairs the arrays whose sum is equal to the given valLe x
    static int pairSum(int[] arr, int target) {
        int n = arr.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    ans++;
                }
            }
        }
        return ans;
    }

    //    Program to count total number of triplets whose sum is equal to tte given value x
    static int tripleSum(int[] arr, int target) {
        int n = arr.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }

    // Find the unique number in a given Array where all the elements are being repeated twice with one value being unique. (only positive numbers)
    static int findUnique(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }

        int ans = -1;
        for (int j : arr) {
            if (j != -1) {
                ans = j;
            }
        }

        return ans;
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

        //    Program to find the total number of pairs the arrays whose sum is equal to the given valLe x
        System.out.println("Enter target : ");
        int target = sc.nextInt();
        int pairSum = pairSum(arr, target);
        System.out.println("Target Sum = " + pairSum);

        //    Program to count total number of triplets whose sum is equal to tte given value x
        System.out.println("Enter target : ");
        int target2 = sc.nextInt();
        int tripleSum = tripleSum(arr, target2);
        System.out.println("Target Sum = " + tripleSum);

        // Find the unique number in a given Array where all the elements are being repeated twice with one value being unique. (only positive numbers)
        System.out.println("Unique element is : " + findUnique(arr));
        sc.close();

    }
}

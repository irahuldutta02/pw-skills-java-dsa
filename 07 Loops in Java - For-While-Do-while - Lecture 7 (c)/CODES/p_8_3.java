//reverse a number
//loops

import java.util.Scanner;

public class p_8_3 {
    public static void main(String[] args) {
        System.out.print("Input : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int revDig = 0;
        for (int i = n; i > 0; i /= 10) {
            revDig = (revDig * 10) + i % 10;
        }
        System.out.println("Reversed in for loop is : " + revDig);

        int revDig2 = 0;
        int j = n;

        while (j > 0) {
            revDig2 = (revDig2 * 10) + j % 10;
            j /= 10;
        }
        System.out.println("Reversed in while loop is : " + revDig2);

    }
}

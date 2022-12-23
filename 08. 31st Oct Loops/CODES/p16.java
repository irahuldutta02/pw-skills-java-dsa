//while loop, for loop
//print the sum of first n natural numbers

import java.util.Scanner;

public class p16 {
    public static void main(String[] args) {
        System.out.print("Input n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("<----- While Loop ----- >");

        int sum = 0;
        int num = 0 ;

        while (num <= n) {
            sum += num;
            num++;
        }

        System.out.println("The sum of first " + n + " natural numbers is : " + sum);

        System.out.println("<----- For Loop ----- >");

        int sum1 = 0;
        for (int num1 = 1; num1 <= n ; num1++) {
            sum1 += num1;
        }

        System.out.println("The sum of first " + n + " natural numbers is : " + sum1);
    }
}

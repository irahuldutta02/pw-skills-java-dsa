//while loops, for loop

//print sum of first n natural numbers

import java.util.Scanner;

public class p15 {
    public static void main(String[] args) {
        System.out.print("Input n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        System.out.println("<----- While Loop ----- >");

        int num = 1;
        while (num <= n) {
            System.out.println(num);
            num++;
        }

        System.out.println("<----- For Loop ----- >");

        for (int num1 = 1 ; num1 <= n ; num1 ++){
            System.out.println(num1);
        }
    }
}


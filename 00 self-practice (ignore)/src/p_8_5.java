//loops
//factorial of n numbers

import java.util.Scanner;

public class p_8_5 {
    public static void main(String[] args) {
        System.out.print("Input n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;

        for (int i = 1; i <= n ; i++){
            fact = fact * i;
            System.out.println("Factorial of "+ i + " is : " + fact);
        }

    }
}

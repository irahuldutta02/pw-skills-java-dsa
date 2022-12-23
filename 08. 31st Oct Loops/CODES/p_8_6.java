//loops
//take input a and b and return a raise to the power b

import java.util.Scanner;

public class p_8_6 {
    public static void main(String[] args) {
        System.out.print("Input a : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Input b : ");
        int b = sc.nextInt();

        int ans = 1;
        for (int i = 1 ; i <= b ; i++){
            ans *= a;
        }
        System.out.print(a + " raise to the power " + b + " is : "+ ans);
    }
}

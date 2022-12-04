//decimal to binary

import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        System.out.print("Input in decimal : ");
        Scanner sc = new Scanner(System.in);
        int decimal_num = sc.nextInt();
        int ans = 0; // binary num
        int pw = 1; // powers of 10

        while (decimal_num > 0){
            int parity = decimal_num % 2;
            ans += (parity * pw);
            pw *= 10;
            decimal_num /= 2;
        }
        System.out.println("In decimal : " + ans);
    }
}
//binary to decimal

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        System.out.print("Input in binary : ");
        Scanner sc = new Scanner(System.in);
        int binary_num = sc.nextInt();

        int ans = 0;

        int pw = 1;

        while (binary_num > 0){
            int unit_digit = binary_num % 10;
            ans += (unit_digit * pw);
            binary_num /= 10;
            pw *= 2;
        }
        System.out.println("In decimal : " + ans);


    }
}

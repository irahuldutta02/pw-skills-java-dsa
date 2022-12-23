//reversed triangular pattern

import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Input R : ");
        int r = sc.nextInt();

        System.out.println("No1 method");

        for (int i = r; i>= 1; i--){
            for (int j = 1; j<= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("No2 method");

        for (int x = 1; x<= r; x++){
            for (int y = 1; y <= (r+1-x); y++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//        123456789
//        123456789
//        123456789
//        123456789

import java.util.Scanner;

public class p7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input R : ");
        int r = sc.nextInt();
        System.out.print("Input C : ");
        int c = sc.nextInt();

        for (int i = 1; i <= r; i++){
            for (int j = 1; j<= c ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

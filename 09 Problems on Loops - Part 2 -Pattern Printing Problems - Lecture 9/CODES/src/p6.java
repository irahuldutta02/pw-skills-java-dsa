//        1234567
//        2345671
//        3456712
//        4567123
//        5671234
//        6712345
//        7123456

import java.util.Scanner;

public class p6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input R : ");
        int r = sc.nextInt();

        for (int i = 1; i<= r ; i++){
            for (int j = i; j<= r ; j++){
                System.out.print(j);
            }
            for (int k = 1; k<= i-1; k++ ){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}

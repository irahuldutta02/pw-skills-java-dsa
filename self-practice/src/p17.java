//loops for loop

//print numbers n to 1 in reverse order

import java.util.Scanner;

public class p17 {
    public static void main(String[] args) {
        System.out.print("Input n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int num = n; num >= 1; num --){
            System.out.println(num);
        }


    }
}

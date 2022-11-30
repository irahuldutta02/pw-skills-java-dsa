//loops , while loop
//sum of stream of int input

import java.util.Scanner;

public class p18 {
    public static void main(String[] args) {
        System.out.print("Input : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;

        while(num != -1){
            sum +=num;
            System.out.println("Sum : " + sum);
            System.out.print("Input : ");
            num = sc.nextInt();
        }

        System.out.println("Your last Sum is : " + sum);
    }
}


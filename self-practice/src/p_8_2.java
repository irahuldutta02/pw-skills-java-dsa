//loops
//sum of digits using for loop and while loop

import java.util.Scanner;

public class p_8_2 {
    public static void main(String[] args) {
        System.out.println("Input the number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


//        for loop

        int sum = 0;
        for (int  i = n; i > 0; i/=10){
            sum += i % 10;
        }

        System.out.println("Sum of digits in " + n + "using for loop is " + sum);

//        while loop

        int j = n;
        int sum2 = 0;
        while(j>0){
            sum2 += j % 10 ;
            j /= 10;
        }

        System.out.println("Sum of digits in " + n + "using while loop is " + sum2);
    }
}

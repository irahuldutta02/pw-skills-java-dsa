//sum of two numbers
import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st Number : ");
        int num_1 = sc.nextInt();

        System.out.print("Enter 2nd Number : ");
        int num_2 = sc.nextInt();

        System.out.println("Sum of these 2 numbers are : "+ (num_1+num_2));
    }
}

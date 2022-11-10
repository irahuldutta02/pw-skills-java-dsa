//taking input in java
import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        System.out.print("Enter your lucky number : ");
        int num_1 = sc.nextInt();

        System.out.println("Your name is : " + name);
        System.out.println("Your lucky number is : " + num_1);
    }
}
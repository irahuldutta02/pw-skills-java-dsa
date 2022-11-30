import java.util.Scanner;

//Write a program to print the value if it is even and divisible by 3.
public class p12 {
    public static void main(String[] args) {
        System.out.print("Number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 2 == 0 && num % 3 == 0){
            System.out.println("The ans - " + num);
        }
    }
}

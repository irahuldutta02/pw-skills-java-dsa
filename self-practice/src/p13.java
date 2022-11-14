import java.util.Scanner;

//Write a program to print the value if it is divisible by 3 or 5.
public class p13 {
    public static void main(String[] args) {
        System.out.print("Number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 3 == 0 || num % 5 == 0){
            System.out.println("The ans - " + num);
        }
    }
}
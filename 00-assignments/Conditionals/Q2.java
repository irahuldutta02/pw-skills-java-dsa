import java.util.Scanner;

// Q2 - Write a program to print absolute value of a number entered by the user.
// Sample Input : -1
// Sample Output : 1


public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        if (n<0){
            System.out.println("Absolute value of the number is : "+ (n*-1));
        }else{
            System.out.println("Absolute value of the number is : "+ n);
        }
    }
}

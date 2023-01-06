import java.util.Scanner;

// Q1 - Write a program which takes the values of length and breadth from user and check if it is
// a square or not.

// Sample Input :

// Sample Output :
// Enter length:
// 5
// Enter breadth:
// 4

// It is a rectangle

public class Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input lenngth and breadth : ");
        int l = sc.nextInt();
        int b =sc.nextInt();

        if(l==b){
            System.out.println("It is a Square");
        }else{
            System.out.println("It is not a rectangle");
        }
    }
}
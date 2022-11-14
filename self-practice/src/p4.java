import java.util.Scanner;

//if else statement
//odd even
public class p4{
    public static void main(String[] args) {
        System.out.print("Input a number to check even or odd : ");
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();

        if(num % 2 == 0 ){
            System.out.println("The number is even.");
        }
        else{
            System.out.println("The number is odd.");
        }
    }
}

import java.util.Scanner;

// Q3 - Write a program to take input from user for Cost Price (C.P.) and Selling Price(S.P.) and
// calculate Profit or Loss.

// Explanation : Formula for profit and loss
// Profit = S.P - C.P
// Loss = C.P - S.P
// (S.P is Selling Price and C.P is Cost Price)

// Sample Input :
// Enter cost price: 4000
// Enter selling price: 9560

// Sample Output :
// Profit = 5560

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cost Price : ");
        int cp = sc.nextInt();
        System.out.println("Selling price : ");
        int sp = sc.nextInt();
        
        if(cp>sp){
            System.out.println("Loss : "+(cp-sp));
        }else{
            System.out.println("Profit : "+(sp-cp));
        }
    }
}

// Q2 - Write a program to enter the numbers till the user wants, the number can be positive,
// negative or zero. Calculate the sum of numbers until a negative number is encountered. If the input is a negative number, current sum is discarded and print -1.
// Input:
// 2
// 48
// 0
// 6
// -5
// 9
// 7
// Expected Output1:
// -1

import java.util.Scanner;

public class p02 {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int sum = 0;
    while (scn.hasNextInt()) { //check if input exists or not
      int num = scn.nextInt();
      if (num >= 0) { //if input is positive or zero add it to the current sum
        sum += num;
      } else {
        sum = -1; //input is negative so change sum to -1 and break out of the loop
        break;
      }
    }
    System.out.print(sum);
  }
}

// Q1 - Input name, roll number and field of interest from user and print in the format below :
// Name: xyz, Roll number: xyz, Field of interest: xyz

import java.util.Scanner;

public class Q1 {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String first_name = scn.next();
    String last_name = scn.next();
    int roll_number = scn.nextInt();
    String field_of_interest = scn.next();
    System.out.println("Name: " + first_name + " " + last_name);
    System.out.println("Roll Number: " + roll_number);
    System.out.println("Field of interest: " + field_of_interest);
    scn.close();
  }
}

// Q3 - If the marks of Robert in three subjects are entered through keyboard (each out of 100), write a program
// to calculate his total marks and percentage marks.

import java.util.Scanner;

public class Q3 {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int mark1 = scn.nextInt();
    int mark2 = scn.nextInt();
    int mark3 = scn.nextInt();
    int total_marks = mark1 + mark2 + mark3;
    int percentage = (total_marks / 3);
    System.out.println(total_marks);
    System.out.println(percentage + "%");
    scn.close();
  }
}

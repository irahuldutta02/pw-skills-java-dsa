// Q2 - Input two different string and print them in same line.

import java.util.Scanner;

public class Q2 {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String first = scn.nextLine();
    String last = scn.nextLine();
    System.out.println(first + last);
    scn.close();
  }
}

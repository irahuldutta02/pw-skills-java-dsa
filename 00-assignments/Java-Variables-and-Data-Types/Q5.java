// Q5 - Write a Java program to swap two numbers with the help of a third variable.
public class Q5 {

  public static void main(String[] args) {
    int num1 = 2;
    int num2 = 3;
    System.out.println("The first number before swap is :" + num1);
    System.out.println("The second number before swap is : " + num2);
    int temp; //variable used to swap two numbers
    temp = num1;
    num1 = num2;
    num2 = temp;
    System.out.println("The first number after swap is :" + num1);
    System.out.println("The second number after swap is : " + num2);
  }
}

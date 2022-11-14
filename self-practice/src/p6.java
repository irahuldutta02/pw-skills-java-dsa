import java.util.Scanner;

//if else statement
//child or teen or adult
public class p6 {
    public static void main(String[] args) {
        System.out.print("Your age : ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age < 12){
            System.out.println("Child");
        } else if (age > 12 && age <18) {
            System.out.println("Teen");
        }else {
            System.out.println("Adult");
        }
        sc.close();
    }
}

//simple interest
import java.util.Scanner;

public class p2 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Input P , R , T respectively with space : ");
        float p = sc.nextFloat();
        float r = sc.nextFloat();
        float t = sc.nextFloat();

        System.out.println("SI is : "+ ((p*r*t)/100));
    }
}

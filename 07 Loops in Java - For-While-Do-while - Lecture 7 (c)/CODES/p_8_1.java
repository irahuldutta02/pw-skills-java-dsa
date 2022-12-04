import java.util.Scanner;
//loops
//count the number of digits for a given number using for loop & while loop

public class p_8_1 {
    public static void main(String[] args) {
        System.out.print("Input the number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        for loop

        int numOfdigits = 0;
        for (int  i = n; i > 0; numOfdigits++ ){
            i/=10;
        }

        System.out.println("Number of digits in " + n + "using for loop is " + numOfdigits);

//        while loop

        int j = n;
        int numOfdigits2 = 0;
        while(j>0){
            j/=10;
            numOfdigits2++;
        }

        System.out.println("Number of digits in " + n + "using while loop is " + numOfdigits2);
    }
}

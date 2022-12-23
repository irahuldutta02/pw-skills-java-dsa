//loops
//sum of following series
//      s = 1 - 2 + 3 - 4 + ... n


import java.util.Scanner;

public class p_8_4 {
    public static void main(String[] args) {
        System.out.println("Input n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        for(int i = 1; i <= n ; i++){
            if (i % 2 == 0) {
                sum -= i;
            }else{
                sum += i;
            }
        }
        System.out.println(sum);
    }
}

//pattern hollow rectangle

import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Input C : ");
        int c = sc.nextInt();
        System.out.print("Input R : ");
        int r = sc.nextInt();

        for (int i = 1; i<= r; i++){
            for (int j = 1; j<= c; j++){
                if(i==1 || i==r || j== 1 || j== c){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

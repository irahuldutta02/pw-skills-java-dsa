//loops
//continue  key word
// label in loop
//print all the values between 1 and 50 except for the multiple of 3 (important in while loop)

public class p20 {
    public static void main(String[] args) {

        System.out.println("=== FOR LOOP ===");

//        label  in loops
        mylopp : for(int num = 1; num<=50; num++){
            if (num % 3 == 0){
                continue mylopp;
            }
            System.out.println(num);
        }

        System.out.println("=== WHILE LOOP ===");

        int num2 = 1;

//        label in loops
        myloop2 : while(num2 <= 50){
            if(num2 % 3 == 0){
                num2++; // (important)
                continue myloop2;
            }
            System.out.println(num2);
            num2++;
        }
    }
}

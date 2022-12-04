//loop
//break keyword
// print the first number divisible by 5 & 7
public class P19 {
    public static void main(String[] args) {
        int num = 1;
        while(true){
            if ((num % 5 == 0) && (num % 7 == 0)){
                System.out.println("Found : " + num);
                break;
            }
            num++;
        }
    }
}

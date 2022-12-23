public class p1{
    public static void main(String[] args) {
        System.out.println(9|10); // biwise or (if any one is one return 1)(returns 11)
        System.out.println(9&10); // biwise and (if both are one return 1) (returns 8)
        System.out.println(9^10); // XOR (is both are same return 0 other wise return 1) (returns 3)
        System.out.println(~9); // bitwise not/complement (inverts all the digits) (returns -10)
        System.out.println(9<<2); // left shift (returns 36)
        System.out.println(9>>2); // left shift (returns 2)
    }
}
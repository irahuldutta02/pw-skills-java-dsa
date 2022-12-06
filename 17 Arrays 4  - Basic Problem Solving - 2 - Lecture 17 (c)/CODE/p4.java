import java.util.Scanner;

public class p4 {
    static int[] createFreqArray(int [] arr){
        int[] freq = new int[1000005];
        for (int i=0; i<arr.length; i++){
            freq[arr[i]]++;
        }
        return freq;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Input " + n + " array element : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] freq = createFreqArray(arr);

        System.out.print("Enter number of queries : ");
        int q = sc.nextInt();

        while (q>0){
            System.out.print("Number to be searched: ");
            int x = sc.nextInt();
            if(freq[x]> 0){
                System.out.println("Yes, " + freq[x]+ " times");
            }else {
                System.out.println("No");
            }
            q--;
        }
    }
}

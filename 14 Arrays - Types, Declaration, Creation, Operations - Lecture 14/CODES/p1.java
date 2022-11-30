//array

public class p1 {

    //sum of elements in array
    void sumOfArray() {
        int[] arr = {1, 2, 3, 4};
        int sum = 0;

        for (int i : arr) {
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }

    //max value out of all elements in an array
    void maxValueOfArray(){
        int[] arr = {-20, 2, 3, 4};
        int maxValue = arr[0];

        for (int j : arr) {
            if (maxValue < j) {
                maxValue = j;
            }
        }
        System.out.println("Max = " + maxValue);
    }

    //search the element in  the array
    void searchTheElement(){
        int[] arr = {-20, 2, 3, 4, 4};
        int ans = -1;
        int element = 4;

        for (int i = 0 ; i< arr.length; i++) {
            if (arr[i] == element) {
                ans = i;
                System.out.println(element + " found at index " + ans);
            }
        }
        if (ans == -1){
            System.out.println(element + " not found");
        }
    }

    public static void main(String[] args) {
        //creating object of p1 class
        p1 obj = new p1();
        // sum of elements in array
        obj.sumOfArray();
        //max value out of all elements in an array
        obj.maxValueOfArray();
        //search the element in  the array
        obj.searchTheElement();

    }
}

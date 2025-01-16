public class SumOfElementInArray {
    public static void main(String[] args) {
        // define variables
        int arr[] = { 1, 2, 3, 4, 5 };
        int sum = 0;

        // iterate
        // for (int i = 0; i < arr.length; i++) {
        // sum = sum + arr[i];
        // }

        for (int value : arr) {
            sum = sum + value;
        }

        // print sum
        System.out.println(sum);
    }
}

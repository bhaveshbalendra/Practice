public class LargestElementInArray {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 6, 20, 40 };
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println(max);

    }
}

import java.util.Arrays;

public class SmallestElementInArray {
    static int smallestNum(int arr[], int n) {
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 3, 2, 5, 2, 3 };
        Arrays.sort(arr);
        System.out.println(arr[0]);
        System.out.println(smallestNum(arr, arr.length));
    }
}
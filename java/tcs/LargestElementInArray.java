import java.util.Arrays;

public class LargestElementInArray {
    public static void main(String[] args) {
        int[] arr = { 0, 3, 2, 5, 2, 3 };
        Arrays.sort(arr);
        System.out.println(arr[arr.length - 1]);
    }
}

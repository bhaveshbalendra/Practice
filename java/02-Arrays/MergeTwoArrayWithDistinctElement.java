import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoArrayWithDistinctElement {
    public static void main(String[] args) {

        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8 };

        int[] arr2 = { 4, 5, 6, 7, 8, 9, 10 };

        int[] val = Arrays.copyOf(arr1, arr1.length);

        System.out.println(val.toString());

    }
}
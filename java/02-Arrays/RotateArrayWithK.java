import java.util.Arrays;

public class RotateArrayWithK {
    public static void main(String[] args) {
        int nums[] = { 5, 6, 7, 1, 2, 3, 4 };
        int k = 4;
        rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }

    public static void rotate(int[] nums, int k) {
        int temp[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            temp[(i + k) % nums.length] = nums[i];
        }
        nums = temp;
    }
}

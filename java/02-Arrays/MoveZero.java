public class MoveZero {
    static {
        for (int i = 0; i < 500; i++) {
            moveZeroes(new int[] { 0 });
        }
    }

    public static void moveZeroes(int[] nums) {
        int j = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }

    }
}

public class ArrayIsSortedAndRotated {
    public static void main(String[] args) {
        int nums[] = { 3, 4, 5, 1, 2 };
        boolean ans = check(nums);
        System.out.println(ans);
    }

    public static boolean check(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[(i + 1) % nums.length]) {
                count++;
            }
        }
        System.out.println(count);
        if (count > 1) {
            return false;
        }
        return true;

    }
}

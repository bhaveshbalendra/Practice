public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int sum = 0;
        int max = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                sum++;
            } else {
                max = Math.max(max, sum);
                sum = 0;
            }
        }
        return Math.max(max, sum);
    }

}

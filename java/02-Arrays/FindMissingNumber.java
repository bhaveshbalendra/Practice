public class FindMissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length + 1;
        int sum = 0;
        int sum2 = 0;

        for (int i = 0; i < n; i++) {
            sum += i;
        }

        for (int j = 0; j < n - 1; j++) {
            sum2 += nums[j];
        }

        return sum - sum2;
    }

    public int missingNumbesr(int[] nums) {
        int n = nums.length;
        int sum = n * (n + 1) / 2; // Sum of first n natural numbers

        int sum2 = 0;
        for (int num : nums) {
            sum2 += num;
        }

        return sum - sum2;
    }

}

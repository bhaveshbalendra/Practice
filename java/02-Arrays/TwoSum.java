import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mp = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {

            int rem = target - nums[i];
            if (!mp.containsKey(rem)) {
                mp.put(nums[i], i);
            } else {
                return new int[] { i, mp.get(rem) };
            }
        }
        return new int[] {};
    }
}

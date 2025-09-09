import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();

        for (int n : nums) {
            mp.put(n, mp.getOrDefault(n, 0) + 1);
        }

        for (var m : mp.entrySet()) {
            if (m.getValue() == 1) {
                return m.getKey();
            }
        }

        return -1;
    }

    public int singleNumbers(int[] nums) {

        int result = 0;
        for (int n : nums) {
            result ^= n;
        }

        return result;
    }
}

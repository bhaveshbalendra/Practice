import java.util.HashMap;
import java.util.Map;

public class MaxFreqNumInArray {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 1, 4, 1 };
        Map<Integer, Integer> map = new HashMap<>();
        for (var i : arr) {
            if (map.containsKey(i)) {
                map.put(i, 1 + map.get(i));
            } else
                map.put(i, 1);
        }
        int max = 0;
        int maxKey = 0;

        for (var e : map.entrySet()) {
            if (e.getValue() > max) {
                max = e.getValue();
                maxKey = e.getKey();

            }
        }
        System.out.println("Max Frequecy is of " + maxKey + " Which is " + max);
    }
}
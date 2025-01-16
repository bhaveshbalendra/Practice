import java.util.Arrays;
import java.util.HashMap;

public class HighestFrequencyElement {
    public static void main(String[] args) {
        int arr[] = { 10, 5, 10, 15, 10, 5 };

        System.out.println(Arrays.toString(highLowFrequency(arr)));
    }

    static int[] highLowFrequency(int arr[]) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int num : arr) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        int maxKey = 0;
        int min = Integer.MAX_VALUE;
        int minKey = 0;

        for (var entry : hm.entrySet()) {
            int frequency = entry.getValue();
            int key = entry.getKey();

            if (frequency > max) {
                max = frequency;
                maxKey = key;
            }

            if (frequency < min) {
                min = frequency;
                minKey = key;
            }
        }

        return new int[] { maxKey, minKey };
    }
}

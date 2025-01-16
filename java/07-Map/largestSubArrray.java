import java.util.HashMap;

public class largestSubArrray {
    public static void main(String[] args) {
        int arr[] = { 15, -2, 2, -8, 1, 7, 10, 23 };
        System.out.println(zeroSumLargestSubArray(arr));
    }

    static int zeroSumLargestSubArray(int[] arr) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int maxLen = 0;
        int prefSum = 0;
        mp.put(0, -1);

        for (int i = 0; i < arr.length; i++) {
            prefSum += arr[i];
            if (mp.containsKey(prefSum)) {
                maxLen = Math.max(maxLen, i - mp.get(prefSum));

            } else {
                mp.put(prefSum, i);
            }
        }
        return maxLen;
    }
}

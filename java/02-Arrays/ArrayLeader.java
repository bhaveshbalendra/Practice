import java.util.ArrayList;
import java.util.Collections;

public class ArrayLeader {

    class Solution {
        static ArrayList<Integer> leaders(int arr[]) {
            ArrayList<Integer> result = new ArrayList<>();
            int n = arr.length;
            int max = 0;
            for (int i = n - 1; i >= 0; i--) {
                if (arr[i] >= max) {
                    result.add(arr[i]);

                    max = Math.max(max, arr[i]);

                }
            }
            System.out.println("hello");
            Collections.reverse(result);
            return result;
        }
    }

}

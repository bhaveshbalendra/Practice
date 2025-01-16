// import java.util.Arrays;

// public class TwoSum {
// public static void main(String[] args) {
// int num[] = { 10, 12, 10, 15, -1, 7, 6, 4, 2, 1 };
// int target = 6;
// int[] result = twoSum(num, target);

// System.out.println(Arrays.toString(result));
// }

// public static int[] twoSum(int[] num, int target) {
// for (int i = 0; i < num.length - 1; i++) {
// for (int j = i + 1; j < num.length; j++) {
// if (num[i] + num[j] == target) {
// return new int[] { i, j };
// }
// }
// }
// return new int[] { -1 };
// }
// }

// import java.util.HashMap;
// import java.util.Arrays;

// public class TwoSum {

// public static void main(String[] args) {
// int num[] = { 10, 12, 10, 15, -1, 7, 6, 4, 2, 1 };
// int target = 6;
// int result[] = twoSum(num, target);
// System.out.println(Arrays.toString(result));
// }

// public static int[] twoSum(int num[], int target) {
// HashMap<Integer, Integer> map = new HashMap<>();

// for (int i = 0; i < num.length; i++) {
// if (map.containsKey(target - num[i])) {
// return new int[] { map.get(target - num[i]), i };
// }
// map.put(num[i], i);
// }
// return new int[] {};
// }
// }

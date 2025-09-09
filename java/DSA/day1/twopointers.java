// Two Pointers Technique in Java
// https://leetcode.com/problems/two-sum/submissions/1706821601/

// Brute Force Approach
// Time Complexity: O(n^2)
// public static int[] twoSum_BruteForce(int[] nums, int target) {
// for (int i = 0; i < nums.length; i++) {
// for (int j = i + 1; j < nums.length; j++) {
// if (nums[i] + nums[j] == target) {
// return new int[] { i, j };
// }
// }
// }
// return new int[] {}; // No solution found
// }

// HashMap Approach
// Time Complexity: O(n)
// Space Complexity: O(n)
// public static int[] twoSum(int[] nums, int target) {
// Map<Integer, Integer> numMap = new HashMap<>();

// for (int i = 0; i < nums.length; i++) {
// int complement = target - nums[i];

// if (numMap.containsKey(complement)) {
// return new int[] { numMap.get(complement), i };
// } else {
// numMap.put(nums[i], i);
// }
// }
// return new int[] {}; // No solution found
// }

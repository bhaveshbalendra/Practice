public class SecondLargestElement {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 6, 20, 40 };

        System.out.println(print2largest(arr));
    }

    public static int print2largest(int[] arr) {
        int secondMax = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;

        if (arr.length < 2) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }

        for (int num : arr) {
            if (num > secondMax && num < max) {
                secondMax = num;
            }
        }

        return secondMax == Integer.MAX_VALUE ? -1 : secondMax;
    }
}

public class PrintEvenOddFromArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        for (int value : arr) {
            if (value % 2 == 0) {
                System.out.println("Even: " + value);
            } else {
                System.out.println("Odd: " + value);
            }
        }
    }
}

public class CountEvenAndOddDigitInNumber {
    public static void main(String[] args) {
        int num = 145678;

        int oddCount = 0;
        int evenCount = 0;

        while (num != 0) {

            int rem = num % 10;
            if (rem % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            num = num / 10;
        }
        System.out.println("Number of Evens are " + evenCount);
        System.out.println("Number of Odds are " + oddCount);
    }
}

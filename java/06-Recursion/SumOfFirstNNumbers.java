public class SumOfFirstNNumbers {
    public static void main(String[] args) {

        System.out.println(printSum(5));
    }

    static int printSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + printSum(n - 1);
    }

}

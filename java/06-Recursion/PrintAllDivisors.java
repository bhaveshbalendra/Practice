import java.util.ArrayList;

public class PrintAllDivisors {

    public static void main(String[] args) {
        int number = 12;

        ArrayList<Integer> divisors = new ArrayList<>();
        findDivisors(number, 1, divisors);

        System.out.println("Divisors of " + number + " are: ");

        for (int divisor : divisors) {
            System.out.print(divisor + " ");
        }
    }

    static void findDivisors(int n, int i, ArrayList<Integer> list) {
        // Base condition to stop recursion
        if (i > Math.sqrt(n)) {
            return;
        }

        // If 'i' is a divisor of 'n'
        if (n % i == 0) {
            list.add(i);
            if (i != n / i) { // Check to avoid adding square root twice
                list.add(n / i);
            }
        }

        // Recur for the next divisor
        findDivisors(n, i + 1, list);
    }
}

// public class PrintAllDivisors {

// public static void main(String[] args) {
// int number = 12;

// ArrayList<Integer> divisors = findDivisors(number);

// System.out.println("Divisors of " + number + "are: ");

// for (int divisor : divisors) {
// System.out.println(divisor + " ");

// }

// }

// static ArrayList<Integer> findDivisors(int n) {
// ArrayList<Integer> list = new ArrayList<>();

// for (int i = 1; i <= Math.sqrt(n); i++) {
// if (n % i == 0) {
// list.add(i);
// }
// if (i != n % i) {
// list.add(n / i);
// }
// }
// return list;
// }

// }

// public class PrintAllDivisors {

// public static void main(String[] args) {
// printNumber(10, 1);
// }

// static void printNumber(int n, int i) {
// if (n <= i) {
// System.out.println(n);
// return;
// }
// if (n % i == 0) {
// System.out.println(i);
// }
// printNumber(n, i + 1);
// }
// }
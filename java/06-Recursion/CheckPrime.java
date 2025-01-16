public class CheckPrime {

    public static void main(String[] args) {
        int number = 29; // Example number to check

        boolean isPrime = isPrime(number, 2);

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    static boolean isPrime(int n, int i) {
        // Base case 1: If n is less than 2, it's not a prime number
        if (n < 2) {
            return false;
        }

        // Base case 2: If i*i > n, no divisors have been found, so n is prime
        if (i * i > n) {
            return true;
        }

        // Base case 3: If n is divisible by i, n is not prime
        if (n % i == 0) {
            return false;
        }

        // Recursive call: Check the next possible divisor
        return isPrime(n, i + 1);
    }
}

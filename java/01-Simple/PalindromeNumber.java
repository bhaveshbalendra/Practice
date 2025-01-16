public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 14321;
        int originalNumber = num;

        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        if (originalNumber == rev) {
            System.out.println(originalNumber + " " + "is Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}

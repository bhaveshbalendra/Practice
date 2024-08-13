public class PalindromeString {
    public static void main(String[] args) {
        String str = "abcba";
        String originalString = str;
        int len = str.length();

        String rev = "";
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (originalString.equals(rev)) {
            System.out.println(originalString + " " + "is Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}

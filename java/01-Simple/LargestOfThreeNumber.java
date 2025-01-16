public class LargestOfThreeNumber {
    public static void main(String args[]) {
        int a = 10;
        int b = 20;
        int c = 30;

        if (a > b && a > c) {
            System.out.println(a + " is Largest Number");
        } else if (b > a && b > c) {
            System.out.println(b + " is Largest Number");

        } else {
            System.out.println(c + " is Largest Number");
        }
    }

}

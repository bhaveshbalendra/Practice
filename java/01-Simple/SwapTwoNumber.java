public class SwapTwoNumber {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // int c = b;
        // b = a;
        // a = c;

        // a = a + b;
        // b = a - b;
        // a = a - b;

        b = a + b - (a = b);

        System.out.println(a);
        System.out.println(b);
    }
}

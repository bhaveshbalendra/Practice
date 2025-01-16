
public class PrintNTimes {

    static void printNTimes(int n) {
        if (n == 0)
            return;

        printNTimes(n - 1);

        System.out.println(n);
    }

    public static void main(String[] args) {
        int n = 10;

        printNTimes(n);
    }
}

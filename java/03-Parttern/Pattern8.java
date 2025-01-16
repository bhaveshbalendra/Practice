import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Give Number of Rows: ");
            int numberOfRows = sc.nextInt();
            for (int i = numberOfRows; i > 0; i--) {
                if (i <= numberOfRows - 1) {
                    for (int k = 0; k < numberOfRows - i; k++) {
                        System.out.print(" ");
                    }
                }
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                for (int m = i - 1; m > 0; m--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

    }
}
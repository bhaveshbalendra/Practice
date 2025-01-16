import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your Number of Rows: ");
            int numberOfRows = sc.nextInt();
            System.out.println(numberOfRows);
            if (numberOfRows > 0) {
                for (int i = 0; i < numberOfRows; i++) {
                    for (int j = numberOfRows - 1 - i; j > 0; j--) {
                        System.out.print(" ");
                    }
                    for (int k = 0; k <= i; k++) {
                        System.out.print("*");
                    }
                    if (i >= 1) {
                        for (int m = 0; m < i; m++) {
                            System.out.print("*");
                        }
                    }
                    System.out.println();
                }
            } else
                System.out.println("Enter rows greater than zero");
        }

    }

}

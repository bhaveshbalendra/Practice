import java.util.Scanner;
import java.lang.Integer;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static int[] findGreater(int[] Arr, int N) {
        ArrayList<Integer> resultArray = new ArrayList<>();

        resultArray.add(Arr[0]);

        for (int i = 0; i < Arr.length - 1; i++) {
            if (Arr[i + 1] > Arr[i]) {
                resultArray.add(Arr[i + 1]);
            }
        }

        return resultArray.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] Arr = new int[N];

        for (int i = 0; i < N; i++) {
            Arr[i] = sc.nextInt();
        }

        sc.close();

        System.out.println(Arrays.toString(findGreater(Arr, N)));
    }
}
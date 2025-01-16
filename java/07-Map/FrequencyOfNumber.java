
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FrequencyOfNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        // float b = Float.parseFloat(br.readLine());

        int arr[] = new int[n];

        String strArr[] = br.readLine().split(" ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }
        int hashNum[] = new int[n];
        Arrays.fill(hashNum, 0);

        for (int i = 0; i < n; i++) {
            hashNum[arr[i]] += 1;
        }

        for (int elem : hashNum) {
            System.out.println(elem);
        }
    }
}

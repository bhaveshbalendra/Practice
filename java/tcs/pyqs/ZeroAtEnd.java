// Problem Statement –

// A chocolate factory is packing chocolates into the packets. The chocolate packets here represent an array  of N number of integer values. The task is to find the empty packets(0) of chocolate and push it to the end of the conveyor belt(array).

// Example 1 :

// N=8 and arr = [4,5,0,1,9,0,5,0].

// There are 3 empty packets in the given set. These 3 empty packets represented as O should be pushed towards the end of the array

// Input :

// 8  – Value of N

// [4,5,0,1,9,0,5,0] – Element of arr[O] to arr[N-1],While input each element is separated by newline

// Output:

// 4 5 1 9 5 0 0 0

// Example 2:

// Input:

// 6 — Value of N.

// [6,0,1,8,0,2] – Element of arr[0] to arr[N-1], While input each element is separated by newline

// Output:

// 6 1 8 2 0 0

// custom input
// 8
// 4
// 5
// 0
// 1
// 9
// 0
// 5
// 0

package pyqs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.Integer;

public class ZeroAtEnd {
    static void moveZeroToEnd(int N, int[] arr) {
        int left = 0;

        for (int right = 0; right < N; right++) {
            if (arr[right] != 0) {
                int temp = arr[left];

                arr[left] = arr[right];

                arr[right] = temp;

                left++;
            }
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        moveZeroToEnd(N, arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
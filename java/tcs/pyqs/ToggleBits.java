// Joseph is learning digital logic subject which will be for his next semester. He usually tries to solve unit assignment problems before the lecture. Today he got one tricky question. The problem statement is “A positive integer has been given as an input. Convert decimal value to binary representation. Toggle all bits of it after the most significant bit including the most significant bit. Print the positive integer value after toggling all bits”.

// Constrains-

// 1<=N<=100

// Example 1:

// Input :

// 10  -> Integer

// Output :

// 5    -> result- Integer

// Explanation:

// Binary representation of 10 is 1010. After toggling the bits(1010), will get 0101 which represents “5”. Hence output will print “5”.
package pyqs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.Integer;

public class ToggleBits {
    static int toggleBits(int N) {
        int sum = 0;
        int count = 0;
        while (N > 0) {
            if ((N & 1) == 0) {
                sum = sum + (int) Math.pow(2, count);
            }
            count++;
            N = N >> 1;
            // N=N/2;
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        System.out.print(toggleBits(N));

    }
}

// **Bitwise AND (****`&`****) Operator - Concise Notes**

// **1. What does ****`n & 1`**** do?**

// - It checks the **last bit** of `n`:
// - `n & 1 == 0` → **Even**
// - `n & 1 == 1` → **Odd**

// **2. How does ****`n = n / 2;`**** remove the last bit?**

// - In **binary**, dividing by 2 **shifts bits right** (`>>` operation).
// - Example: `10 (1010) / 2 → 5 (0101)`, **last bit removed**

// **3. What does ****`n >> 1`**** return?**

// - **Right shifts ****`n`**** by 1 bit** (same as `n / 2`).
// - Example: `10 >> 1` → `5 (1010 → 0101)`

// **4. Decimal to Binary Conversion**

// - **Repeated division by 2** (store remainders).
// - Example: `10 → 1010`

// **5. Binary to Decimal Conversion**

// - Multiply bits by powers of `2` and sum.
// - Example: `1010 → (1×2³) + (0×2²) + (1×2¹) + (0×2⁰) = 10`

// **6. Handling Negative Numbers in Binary**

// - Uses **Two’s Complement** (invert bits + add `1`).
// - Example: `-5` in 8-bit → `11111011`

// **7. What does ****`n & m`**** return?**

// - Performs **bitwise AND** on `n` and `m`, **keeping only common ****`1`****
// bits**.
// - Example: `5 & 3 → (0101 & 0011) = 0001 (1)`

// **8. Key Uses of ****`&`**

// | **Operation** | **Expression** | **Use** |
// | ------------------------- | ---------------- |
// ------------------------------ |
// | Check Even/Odd | `n & 1` | `0 → Even`, `1 → Odd` |
// | Power of 2 | `n & (n-1) == 0` | Check if `n` is a power of `2` |
// | Clear Lowest `1` Bit | `n & (n-1)` | Removes rightmost `1` bit |
// | Extract Rightmost `1` Bit | `n & -n` | Gets lowest `1` bit |
// | Masking | `n & (1 << pos)` | Check if bit at `pos` is `1` |

// **9. Bitwise XOR (****`^`****) and NOR (****`~`****) Operators**

// - **XOR (****`^`****)**: Returns `1` if bits are different, `0` if same.
// - Example: `5 ^ 3` → `0101 ^ 0011 = 0110 (6)`
// - Used for **swapping without extra variable**:
// ```java
// a = a ^ b;
// b = a ^ b;
// a = a ^ b;
// ```
// - **NOR (****`~`****)**: Inverts all bits (`1 → 0`, `0 → 1`).
// - Example: `~5` → `11111010` (T**wo’s complement of **``)

// **10. Shift Operators (****`>>`****, ****`>>>`****, ****`<<`****)**

// - **Right Shift (****`>>`****)**: Moves bits right, keeps sign (`1` for
// negative numbers).
// - Example: `-5 >> 1` → Keeps negative sign
// - **Unsigned Right Shift (****`>>>`****)**: Moves bits right, fills left with
// `0`.
// - Example: `-5 >>> 1` → Converts to positive
// - **Left Shift (****`<<`****)**: Moves bits left, fills right with `0`.
// - Example: `5 << 1` → `1010 (10)`

// **11. Java Methods for Bitwise Operations**

// ```java
// // Check if a number is even or odd
// public static boolean isEven(int n) {
// return (n & 1) == 0;
// }

// // Convert decimal to binary string
// public static String decimalToBinary(int n) {
// return Integer.toBinaryString(n);
// }

// // Convert binary string to decimal
// public static int binaryToDecimal(String binary) {
// return Integer.parseInt(binary, 2);
// }

// // Count the number of set bits (1s) in a number
// public static int countSetBits(int n) {
// int count = 0;
// while (n > 0) {
// count += (n & 1);
// n >>= 1;
// }
// return count;
// }
// ```

// **12. Handling Negative Numbers in Bitwise Operations**

// - **Two’s Complement Representation**

// - A negative number `-N` is stored as `(~N + 1)` (invert bits + add `1`).
// - Example: `-5` in an 8-bit system:
// ```
// 5 = 00000101
// ~5 = 11111010
// +1 = 11111011 (which is -5 in Two’s Complement)
// ```

// - **Effect of ****`n & 1`**** on Negative Numbers**

// - Even if `n` is negative, `n & 1` still checks whether the last bit is `1`
// (odd) or `0` (even).

// - **Example of Negative Numbers in Java**

// ```java
// public class BitwiseNegative {
// public static void main(String[] args) {
// int n = -5;
// System.out.println("Binary of -5: " + Integer.toBinaryString(n));
// System.out.println("-5 & 1: " + (n & 1)); // Still checks if odd/even
// System.out.println("-5 >> 1: " + Integer.toBinaryString(n >> 1)); // Keeps
// sign
// System.out.println("-5 >>> 1: " + Integer.toBinaryString(n >>> 1)); //
// Becomes positive
// }
// }
// ```

// **Bitwise operations are useful for optimizations, bit manipulations, and
// competitive programming!** 🚀

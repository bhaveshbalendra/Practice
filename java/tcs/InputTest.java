import java.util.Arrays;
import java.util.Scanner;

public class InputTest {

    public static void main(String[] args) {

    }
    // public static void main(String[] args) {
    // String input1 = "Java is awesome";

    // // Splitting using `\s` (Single whitespace)
    // String[] words = input1.split("\\s");
    // // Output the array
    // System.out.println(Arrays.toString(words));

    // // input
    // // Java is awesome
    // // output
    // // [Java, is, awesome]

    // String input = "Java is awesome"; // Multiple spaces

    // // Splitting using `\s+` (one or more spaces)
    // String[] wordss = input.split("\\s+");

    // System.out.println(Arrays.toString(wordss));

    // // input
    // // Java is awesome
    // // output
    // // [Java, is, awesome]

    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);

    // // Reading a full line (including spaces)
    // String sentence = sc.nextLine();

    // // Output
    // System.out.println("Sentence: " + sentence);
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);

    // // Read array size
    // int n = sc.nextInt();

    // // Create array
    // int[] arr = new int[n];

    // // Read n elements
    // for (int i = 0; i < n; i++) {
    // arr[i] = sc.nextInt();
    // }

    // // Output the array
    // System.out.print("Array: ");
    // for (int num : arr) {
    // System.out.print(num + " ");
    // }

    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // int c = sc.nextInt();
    // int d = sc.nextInt();
    // int e = sc.nextInt();
    // sc.close();
    // // Output
    // System.out.println("Numbers: " + a + " " + b + " " + c + " " + d + " " + e);
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);

    // String result = sc.next();

    // sc.close();

    // System.out.println(result);

    // // input df fdalk adsjfkl
    // // output df
    // }
}

// Read input "abc123def45gh67" -
// Extract numbers [123, 45, 67] -
// Print output "Array (extracted numbers): 123 45 67"

// stringbuider methods .toString .length() .append() .setLength(0) .charAt()
// mutable string
// .subString(2,4)
// import java.util.*;

// public class ExtractNumbers {
// public static void mostUsedInputFormat(Scanner sc) {
// // Step 1: Read input string
// String line = sc.nextLine();

// // Step 2: Initialize an array list to store numbers
// List<Integer> arr = new ArrayList<>();
// StringBuilder numStr = new StringBuilder();

// // Step 3: Iterate through each character
// for (char ch : line.toCharArray()) {
// if (Character.isDigit(ch)) {
// // Append digit to numStr
// numStr.append(ch);
// } else if (numStr.length() > 0) {
// // Convert numStr to integer and add to list
// arr.add(Integer.parseInt(numStr.toString()));
// numStr.setLength(0); // Reset numStr
// }
// }

// // Step 4: Handle last number if present
// if (numStr.length() > 0) {
// arr.add(Integer.parseInt(numStr.toString()));
// }

// // Step 5: Print extracted numbers
// System.out.print("Array (extracted numbers): ");
// for (int val : arr) {
// System.out.print(val + " ");
// }
// System.out.println();
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the input string:");
// mostUsedInputFormat(sc);
// sc.close();
// }
// }

// Modified Code for Comma-Separated Values
// input
// 10, 20, 30, 40, 50
// 100, , 25, xyz, 300

// import java.util.*;

// public class ExtractNumbersFromCSV {
// public static void mostUsedInputFormat(Scanner sc) {
// // Step 1: Read input string
// String line = sc.nextLine();

// // Step 2: Split the input based on commas
// String[] parts = line.split(",");

// // Step 3: Initialize an array list to store numbers
// List<Integer> arr = new ArrayList<>();

// // Step 4: Process each part
// for (String part : parts) {
// part = part.trim(); // Remove leading and trailing spaces

// if (!part.isEmpty() && part.matches("\\d+")) { // Check if part is a number
// arr.add(Integer.parseInt(part)); // Convert to integer and store
// }
// }

// // Step 5: Print extracted numbers
// System.out.print("Array (extracted numbers): ");
// for (int val : arr) {
// System.out.print(val + " ");
// }
// System.out.println();
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter comma-separated values:");
// mostUsedInputFormat(sc);
// sc.close();
// }
// }

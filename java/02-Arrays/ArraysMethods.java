// import java.util.Arrays;
// import java.util.Collections;

public class ArraysMethods {
    public static void main(String[] args) {
        // int[] numbers = { 1, 6, 3, 4, 5 };

        // Enhanced for-loop
        // for (int num : numbers) {
        // System.out.println(num);
        // }

        // copying an Array
        // int copy[] = Arrays.copyOf(numbers, numbers.length);
        // int copy[] = Arrays.copyOf(numbers, numbers.length - 2);
        // System.out.println(Arrays.toString(copy));

        // sort
        // int sortedInAscending[] = Arrays.sort(numbers); this is wrong it don't return
        // Arrays.sort(numbers);

        // in descending
        // Convert int[] to Integer[]
        // Integer[] numbersInteger =
        // Arrays.stream(numbers).boxed().toArray(Integer[]::new);

        // Sort the array in descending order
        // Arrays.sort(numbersInteger, Collections.reverseOrder());

        // Convert Integer[] back to int[]
        // numbers =
        // Arrays.stream(numbersInteger).mapToInt(Integer::intValue).toArray();

        // Print the sorted array
        // System.out.println(Arrays.toString(numbers));

        // searching in Array
        // binary search should be sorted
        // int index = Arrays.binarySearch(numbers, 3);

        // fill array
        // Arrays.fill(numbers,0);

        // Convert array to list
        // List<Integer> list = Arrays.asList(numbers);

        // list to Array
        // List<String> stringList = Arrays.asList("A", "B", "C");
        // String[] stringArray = stringList.toArray(new String[0]);

        // List<Integer> integerList = Arrays.asList(1, 2, 3);
        // Integer[] integerArray = integerList.toArray(new Integer[0]);

        // System.out.println();
    }
}

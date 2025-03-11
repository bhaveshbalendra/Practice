import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        // ✅ Creating an ArrayList of Strings
        List<String> list = new ArrayList<>();

        // ✅ add(element): Adds an element at the end
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Apple"); // Duplicate allowed
        System.out.println("1️⃣ add: " + list);
        // Output: [Apple, Banana, Cherry, Apple]

        // ✅ add(index, element): Inserts an element at a specific index
        list.add(1, "Mango");
        System.out.println("2️⃣ add at index 1: " + list);
        // Output: [Apple, Mango, Banana, Cherry, Apple]

        // ✅ get(index): Retrieves the element at the specified index
        System.out.println("3️⃣ get(2): " + list.get(2));
        // Output: Banana

        // ✅ set(index, element): Updates the element at a given index
        list.set(2, "Grapes");
        System.out.println("4️⃣ set at index 2: " + list);
        // Output: [Apple, Mango, Grapes, Cherry, Apple]

        // ✅ remove(index): Removes the element at the given index
        list.remove(1);
        System.out.println("5️⃣ remove index 1: " + list);
        // Output: [Apple, Grapes, Cherry, Apple]

        // ✅ remove(Object obj): Removes the first occurrence of the specified element
        list.remove("Cherry");
        System.out.println("6️⃣ remove 'Cherry': " + list);
        // Output: [Apple, Grapes, Apple]

        // ✅ size(): Returns the number of elements
        System.out.println("7️⃣ size: " + list.size());
        // Output: 3

        // ✅ isEmpty(): Checks if the list is empty
        System.out.println("8️⃣ isEmpty: " + list.isEmpty());
        // Output: false

        // ✅ contains(element): Checks if the element exists in the list
        System.out.println("9️⃣ contains 'Apple': " + list.contains("Apple"));
        // Output: true

        // ✅ indexOf(element): Returns the index of the first occurrence of an element
        System.out.println("🔟 indexOf 'Grapes': " + list.indexOf("Grapes"));
        // Output: 1

        // ✅ clear(): Removes all elements from the list
        list.clear();
        System.out.println("1️⃣1️⃣ clear: " + list);
        // Output: []

        // ✅ Checking Again if List is Empty
        System.out.println("1️⃣2️⃣ isEmpty after clear: " + list.isEmpty());
        // Output: true

        // ✅ Sorting Example
        List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 3, 8, 1, 9));
        Collections.sort(numbers);
        System.out.println("1️⃣3️⃣ sort: " + numbers);
        // Output: [1, 3, 5, 8, 9]

        // ✅ Sorting in Reverse Order
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("1️⃣4️⃣ sort in reverse: " + numbers);
        // Output: [9, 8, 5, 3, 1]

        // ✅ Convert List to Array
        Integer[] array = numbers.toArray(new Integer[0]);
        System.out.println("1️⃣5️⃣ Array from List: " + Arrays.toString(array));
        // Output: [9, 8, 5, 3, 1]

        // ✅ Converting Array to ArrayList
        String[] arr = { "Kiwi", "Orange", "Pineapple" };
        List<String> newList = new ArrayList<>(Arrays.asList(arr));
        System.out.println("1️⃣6️⃣ Array to List: " + newList);
        // Output: [Kiwi, Orange, Pineapple]

        // ✅ Using Collections.addAll() to add an array to a list
        Collections.addAll(newList, "Mango", "Papaya");
        System.out.println("1️⃣7️⃣ addAll(): " + newList);
        // Output: [Kiwi, Orange, Pineapple, Mango, Papaya]

        // ✅ Creating an Unmodifiable List
        List<String> unmodifiableList = Collections.unmodifiableList(newList);
        System.out.println("1️⃣8️⃣ unmodifiableList: " + unmodifiableList);
        // Output: [Kiwi, Orange, Pineapple, Mango, Papaya]
        // unmodifiableList.add("Grapes"); // ❌ Throws UnsupportedOperationException
    }
}

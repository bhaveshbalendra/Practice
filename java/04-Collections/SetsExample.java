import java.util.Set;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetsExample {
    public static void main(String[] args) {
        // Creating a HashSet (Set does not allow duplicates)
        Set<String> set = new HashSet<>();

        // ✅ Adds an element to the set (returns true if added, false if already
        // present)
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");

        // ❌ Duplicate values are ignored
        set.add("Apple"); // Won't be added again

        // ✅ Adds all elements from another collection
        set.addAll(Set.of("Mango", "Grapes"));

        // ✅ Checks if an element is present in the set
        System.out.println(set.contains("Banana")); // true

        // ✅ Removes an element from the set
        set.remove("Cherry");

        // ✅ Removes all elements from another collection
        set.removeAll(Set.of("Mango", "Grapes"));

        // ✅ Checks if the set is empty
        System.out.println(set.isEmpty()); // false

        // ✅ Returns the number of elements in the set
        System.out.println(set.size()); // 2

        // ✅ Iterating over elements (order not guaranteed)
        for (String fruit : set) {
            System.out.println(fruit);
        }

        // ✅ Converts the set to an array
        Object[] array = set.toArray();

        // ✅ Retains only the elements in the specified collection (removes others)
        set.retainAll(Set.of("Apple"));

        // ✅ Removes all elements from the set
        set.clear();
        System.out.println(set); // []

        // ✅ Creating a LinkedHashSet (Maintains insertion order)
        Set<String> linkedSet = new LinkedHashSet<>();

        // ✅ Adding elements
        linkedSet.add("Apple");
        linkedSet.add("Banana");
        linkedSet.add("Cherry");
        linkedSet.add("Apple"); // ❌ Duplicate, will not be added

        // ✅ Maintains Insertion Order
        System.out.println(linkedSet); // Output: [Apple, Banana, Cherry]

        // ✅ Checks if an element is present
        System.out.println(linkedSet.contains("Banana")); // true

        // ✅ Removes an element
        linkedSet.remove("Cherry");

        // ✅ Iterating over elements
        for (String fruit : linkedSet) {
            System.out.println(fruit);
        }

        // ✅ Checking the size
        System.out.println("Size: " + linkedSet.size()); // 2

        // ✅ Converting to array
        Object[] arraya = linkedSet.toArray();

        // ✅ Removing all elements
        linkedSet.clear();
        System.out.println(linkedSet.isEmpty()); // true

        // ✅ Array of elements
        String[] fruits = { "Apple", "Banana", "Cherry", "Apple" }; // "Apple" is duplicate

        // ✅ Convert array to HashSet (Mutable)
        Set<String> fruitSet = new HashSet<>();
        Collections.addAll(fruitSet, fruits);

        // ✅ Print Set (Duplicates removed)
        System.out.println(fruitSet); // Output: [Apple, Banana, Cherry]

        // ✅ Array of elements
        String[] fruitss = { "Apple", "Banana", "Cherry", "Apple" };

        // ✅ Convert array to list, then to set (Mutable)
        Set<String> fruitSets = new HashSet<>(Arrays.asList(fruitss));

        // ✅ Print Set
        System.out.println(fruitSets); // Output: [Apple, Banana, Cherry]
    }
}

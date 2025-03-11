import java.util.*;

public class CollectionsExamples {
    public static void main(String[] args) {
        // ✅ 1. addAll(): Adding multiple elements to a List
        List<String> fruits = new ArrayList<>();
        Collections.addAll(fruits, "Apple", "Banana", "Cherry", "Apple");
        System.out.println("1️⃣ addAll: " + fruits);
        // Output: [Apple, Banana, Cherry, Apple]

        // ✅ 2. sort(): Sorting the List
        Collections.sort(fruits);
        System.out.println("2️⃣ sort: " + fruits);
        // Output: [Apple, Apple, Banana, Cherry]

        // ✅ 3. shuffle(): Randomly shuffling elements
        Collections.shuffle(fruits);
        System.out.println("3️⃣ shuffle: " + fruits);
        // Output: [Cherry, Banana, Apple, Apple] (Order may vary)

        // ✅ 4. max() & min(): Finding the max and min elements
        System.out.println("4️⃣ Max: " + Collections.max(fruits) + ", Min: " + Collections.min(fruits));
        // Output: Max: Cherry, Min: Apple

        // ✅ 5. reverse(): Reversing the List
        Collections.reverse(fruits);
        System.out.println("5️⃣ reverse: " + fruits);
        // Output: [Apple, Apple, Banana, Cherry]

        // ✅ 6. replaceAll(): Replacing occurrences of an element
        Collections.replaceAll(fruits, "Apple", "Mango");
        System.out.println("6️⃣ replaceAll: " + fruits);
        // Output: [Mango, Mango, Banana, Cherry]

        // ✅ 7. frequency(): Counting occurrences of an element
        System.out.println("7️⃣ frequency of 'Mango': " + Collections.frequency(fruits, "Mango"));
        // Output: 2

        // ✅ 8. copy(): Copying elements from one list to another
        List<String> copiedList = new ArrayList<>(Arrays.asList(new String[fruits.size()]));
        Collections.copy(copiedList, fruits);
        System.out.println("8️⃣ copy: " + copiedList);
        // Output: [Mango, Mango, Banana, Cherry]

        // ✅ 9. unmodifiableList(): Creating a read-only list
        List<String> unmodifiableList = Collections.unmodifiableList(fruits);
        System.out.println("9️⃣ unmodifiableList: " + unmodifiableList);
        // Output: [Mango, Mango, Banana, Cherry]
        // unmodifiableList.add("Grapes"); // ❌ Throws UnsupportedOperationException

        // ✅ 10. disjoint(): Checking if two lists have no common elements
        List<String> newFruits = Arrays.asList("Grapes", "Pineapple", "Orange");
        boolean isDisjoint = Collections.disjoint(fruits, newFruits);
        System.out.println("🔟 disjoint (fruits & newFruits): " + isDisjoint);
        // Output: true
    }
}

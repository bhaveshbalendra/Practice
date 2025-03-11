import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // ✅ Creating a HashMap (Unordered)
        Map<String, Integer> hashMap = new HashMap<>();

        // ✅ put(key, value): Inserts a key-value pair
        hashMap.put("Alice", 25);
        hashMap.put("Bob", 30);
        hashMap.put("Charlie", 35);
        System.out.println("1️⃣ HashMap after put: " + hashMap);
        // Output: {Alice=25, Bob=30, Charlie=35} (Order may vary)

        // ✅ get(key): Retrieves value associated with key
        System.out.println("2️⃣ get('Alice'): " + hashMap.get("Alice"));
        // Output: 25

        // ✅ containsKey(key): Checks if key exists
        System.out.println("3️⃣ containsKey('Bob'): " + hashMap.containsKey("Bob"));
        // Output: true

        // ✅ containsValue(value): Checks if value exists
        System.out.println("4️⃣ containsValue(40): " + hashMap.containsValue(40));
        // Output: false

        // ✅ size(): Returns the number of key-value pairs
        System.out.println("5️⃣ size(): " + hashMap.size());
        // Output: 3

        // ✅ remove(key): Removes a key-value pair
        hashMap.remove("Charlie");
        System.out.println("6️⃣ remove('Charlie'): " + hashMap);
        // Output: {Alice=25, Bob=30}

        // ✅ isEmpty(): Checks if the map is empty
        System.out.println("7️⃣ isEmpty(): " + hashMap.isEmpty());
        // Output: false

        // ✅ keySet(): Returns all keys
        System.out.println("8️⃣ keySet(): " + hashMap.keySet());
        // Output: [Alice, Bob]

        // ✅ values(): Returns all values
        System.out.println("9️⃣ values(): " + hashMap.values());
        // Output: [25, 30]

        // ✅ entrySet(): Returns all key-value pairs
        System.out.println("🔟 entrySet(): " + hashMap.entrySet());
        // Output: [Alice=25, Bob=30]

        // ✅ clear(): Removes all entries
        hashMap.clear();
        System.out.println("1️⃣1️⃣ clear(): " + hashMap);
        // Output: {}

        // ✅ Checking again if empty
        System.out.println("1️⃣2️⃣ isEmpty after clear(): " + hashMap.isEmpty());
        // Output: true

        // ✅ Using LinkedHashMap (Maintains Insertion Order)
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put("USA", 1);
        linkedHashMap.put("India", 91);
        linkedHashMap.put("UK", 44);
        System.out.println("1️⃣3️⃣ LinkedHashMap after put: " + linkedHashMap);
        // Output: {USA=1, India=91, UK=44} (Maintains order)

        // ✅ Accessing Elements
        System.out.println("1️⃣4️⃣ get('India'): " + linkedHashMap.get("India"));
        // Output: 91

        // ✅ Iterating using for-each
        System.out.println("1️⃣5️⃣ Iterating through LinkedHashMap:");
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println("    Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        // Output:
        // Key: USA, Value: 1
        // Key: India, Value: 91
        // Key: UK, Value: 44
    }
}

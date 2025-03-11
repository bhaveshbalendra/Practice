import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;

public class StackExample {
    public static void main(String[] args) {
        // ✅ Creating a Stack
        Stack<String> stack = new Stack<>();

        // ✅ push(element): Adds an element to the top of the stack
        stack.push("bhavesh");
        stack.push("balendra");
        stack.push("hello");
        System.out.println("1️⃣ Stack after push: " + stack);
        // Output: [bhavesh, balendra, hello]

        // ✅ peek(): Retrieves the top element without removing it
        System.out.println("2️⃣ peek(): " + stack.peek());
        // Output: hello

        // ✅ pop(): Removes and returns the top element of the stack
        System.out.println("3️⃣ pop(): " + stack.pop());
        // Output: hello
        System.out.println("   Stack after pop: " + stack);
        // Output: [bhavesh, balendra]

        // ✅ size(): Returns the number of elements in the stack
        System.out.println("4️⃣ size(): " + stack.size());
        // Output: 2

        // ✅ search(element): Finds position of element from top (1-based)
        System.out.println("5️⃣ search 'bhavesh': " + stack.search("bhavesh"));
        // Output: 2

        // ✅ isEmpty(): Checks if the stack is empty
        System.out.println("6️⃣ isEmpty(): " + stack.isEmpty());
        // Output: false

        // ✅ Clearing the Stack
        stack.clear();
        System.out.println("7️⃣ clear(): " + stack);
        // Output: []

        // ✅ Checking Again if Stack is Empty
        System.out.println("8️⃣ isEmpty after clear(): " + stack.isEmpty());
        // Output: true

        // ✅ Alternative: Using Deque (ArrayDeque) instead of Stack for better
        // performance
        Deque<Integer> dequeStack = new ArrayDeque<>();

        // ✅ push(element): Adds elements to the top
        dequeStack.push(1);
        dequeStack.push(2);
        dequeStack.push(3);
        System.out.println("9️⃣ Deque Stack after push: " + dequeStack);
        // Output: [3, 2, 1]

        // ✅ pop(): Removes and returns the top element
        System.out.println("🔟 pop(): " + dequeStack.pop());
        // Output: 3
        System.out.println("   Deque Stack after pop: " + dequeStack);
        // Output: [2, 1]

        // ✅ peek(): Retrieves the top element without removing it
        System.out.println("1️⃣1️⃣ peek(): " + dequeStack.peek());
        // Output: 2

        // ✅ size(): Returns the number of elements
        System.out.println("1️⃣2️⃣ size(): " + dequeStack.size());
        // Output: 2

        // ✅ isEmpty(): Checks if stack is empty
        System.out.println("1️⃣3️⃣ isEmpty(): " + dequeStack.isEmpty());
        // Output: false

        // ✅ Clearing the Deque Stack
        dequeStack.clear();
        System.out.println("1️⃣4️⃣ clear(): " + dequeStack);
        // Output: []

        // ✅ Checking Again if Deque Stack is Empty
        System.out.println("1️⃣5️⃣ isEmpty after clear(): " + dequeStack.isEmpty());
        // Output: true
    }
}

// Stack<Integer> stack = new Stack<>();
// stack.push(1);
// stack.push(2);
// stack.push(3);

// for (Integer num : stack) {
// System.out.println(num);
// }
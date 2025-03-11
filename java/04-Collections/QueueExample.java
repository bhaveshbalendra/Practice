import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        // ✅ Queue (FIFO - First In First Out)
        Queue<Integer> queue = new LinkedList<>();

        // ✅ add(element): Adds element at the end
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println("1️⃣ Queue after add(): " + queue);
        // Output: [10, 20, 30]

        // ✅ offer(element): Adds element at the end (Returns false instead of throwing
        // an exception if failed)
        queue.offer(40);
        System.out.println("2️⃣ Queue after offer(): " + queue);
        // Output: [10, 20, 30, 40]

        // ✅ peek(): Retrieves but does NOT remove the front element
        System.out.println("3️⃣ peek(): " + queue.peek());
        // Output: 10

        // ✅ poll(): Retrieves and removes the front element
        System.out.println("4️⃣ poll(): " + queue.poll());
        // Output: 10
        System.out.println("   Queue after poll(): " + queue);
        // Output: [20, 30, 40]

        // ✅ remove(): Removes front element, throws exception if empty
        queue.remove();
        System.out.println("5️⃣ remove(): " + queue);
        // Output: [30, 40]

        // ✅ size(): Returns number of elements
        System.out.println("6️⃣ size(): " + queue.size());
        // Output: 2

        // ✅ isEmpty(): Checks if queue is empty
        System.out.println("7️⃣ isEmpty(): " + queue.isEmpty());
        // Output: false

        // ✅ Deque (Double-Ended Queue - Can insert/remove from both ends)
        Deque<Integer> deque = new ArrayDeque<>();

        // ✅ addFirst(element): Adds element at the front
        deque.addFirst(100);
        deque.addFirst(200);
        System.out.println("8️⃣ Deque after addFirst(): " + deque);
        // Output: [200, 100]

        // ✅ addLast(element): Adds element at the end
        deque.addLast(300);
        System.out.println("9️⃣ Deque after addLast(): " + deque);
        // Output: [200, 100, 300]

        // ✅ removeFirst(): Removes and returns the front element
        System.out.println("🔟 removeFirst(): " + deque.removeFirst());
        // Output: 200
        System.out.println("    Deque after removeFirst(): " + deque);
        // Output: [100, 300]

        // ✅ removeLast(): Removes and returns the last element
        System.out.println("1️⃣1️⃣ removeLast(): " + deque.removeLast());
        // Output: 300
        System.out.println("    Deque after removeLast(): " + deque);
        // Output: [100]

        // ✅ peekFirst(): Retrieves front element without removing
        System.out.println("1️⃣2️⃣ peekFirst(): " + deque.peekFirst());
        // Output: 100

        // ✅ peekLast(): Retrieves last element without removing
        System.out.println("1️⃣3️⃣ peekLast(): " + deque.peekLast());
        // Output: 100

        // ✅ PriorityQueue (Min-Heap by default, smallest element comes first)
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // ✅ add() and offer() add elements in natural order
        priorityQueue.add(50);
        priorityQueue.add(10);
        priorityQueue.add(30);
        System.out.println("1️⃣4️⃣ PriorityQueue after add(): " + priorityQueue);
        // Output: [10, 50, 30] (Order depends on internal structure)

        // ✅ peek(): Retrieves but does NOT remove the smallest element
        System.out.println("1️⃣5️⃣ peek(): " + priorityQueue.peek());
        // Output: 10

        // ✅ poll(): Retrieves and removes the smallest element
        System.out.println("1️⃣6️⃣ poll(): " + priorityQueue.poll());
        // Output: 10
        System.out.println("    PriorityQueue after poll(): " + priorityQueue);
        // Output: [30, 50]

        // ✅ remove(): Removes the smallest element
        priorityQueue.remove();
        System.out.println("1️⃣7️⃣ remove(): " + priorityQueue);
        // Output: [50]

        // ✅ Using a Max-Heap (Reverse Order)
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.add(5);
        maxHeap.add(15);
        maxHeap.add(25);
        System.out.println("1️⃣8️⃣ Max-Heap PriorityQueue: " + maxHeap);
        // Output: [25, 5, 15] (Largest element at the top)

        System.out.println("1️⃣9️⃣ maxHeap.poll(): " + maxHeap.poll());
        // Output: 25
        System.out.println("    Max-Heap after poll(): " + maxHeap);
        // Output: [15, 5]
    }
}

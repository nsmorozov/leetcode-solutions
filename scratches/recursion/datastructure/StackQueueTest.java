package recursion.datastructure;

public class StackQueueTest {
    public static void main(String[] args) {
        Stack<Integer> stack = new SimpleStack<>();
        Queue<Integer> queue = new SimpleQueue<>();
        for (int i = 0; i < 10; i++) {
            stack.push(i);
            queue.add(i);
        }
        System.out.println("Stack: ");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println("Queue: ");
        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
}

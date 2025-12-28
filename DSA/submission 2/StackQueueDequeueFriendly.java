import java.util.Stack;

class StackQueueDequeueFriendly {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    
    void enqueue(int data) {
        stack1.push(data);
        System.out.println(data + " inserted");
    }

    
    int dequeue() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        if (stack2.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        return stack2.pop();
    }

    public static void main(String[] args) {
        StackQueueDequeueFriendly q = new StackQueueDequeueFriendly();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Deleted: " + q.dequeue());
        System.out.println("Deleted: " + q.dequeue());
    }
}

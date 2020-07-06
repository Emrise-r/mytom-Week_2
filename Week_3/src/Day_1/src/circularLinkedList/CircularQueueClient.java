package circularLinkedList;

public class CircularQueueClient {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println("DeQueue data is: " + queue.dequeue().data);
    }
}

package circularLinkedList;

public class Queue {
    private Node Front;
    private Node Rear;

    public Queue() {
        this.Front = null;
        this.Rear = null;
    }

    public void enqueue(int data) {
        Node temp = new Node(data);
        if (this.Rear == null) {
            this.Front = this.Rear = temp;
            return;
        }
        this.Rear.link = temp;
        this.Rear = temp;
        this.Rear.link = Front;

    }

    public Node dequeue() {
        if (this.Front == null) {
            return null;
        }
        if (this.Front == this.Rear) {
            this.Front = this.Rear = null;
        }
        Node temp = this.Front;
        this.Front = this.Front.link;
        this.Rear.link = this.Front;
        return temp;
    }
}

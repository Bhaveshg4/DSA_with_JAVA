package Queue.QueueUsingLinkedList;

public class main {
    
    static class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    static class Queue {
        Node front, rear;
        
        Queue() {
            this.front = this.rear = null;
        }
        
        // Check if the queue is empty
        public boolean isEmpty() {
            return front == null;
        }
        
        // Enqueue: Add an element to the end of the queue
        public void enqueue(int data) {
            Node newNode = new Node(data);
            if (rear == null) {
                front = rear = newNode;
                return;
            }
            rear.next = newNode;
            rear = newNode;
        }
        
        // Dequeue: Remove an element from the front of the queue
        public int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int result = front.data;
            front = front.next;
            if (front == null) {
                rear = null;
            }
            return result;
        }
        
        // Peek: Get the front element without removing it
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return front.data;
        }
        
        public static void main(String[] args) {
            Queue q = new Queue();
            q.enqueue(1);
            q.enqueue(2);
            q.enqueue(3);
            q.enqueue(4);
            q.enqueue(5);
            q.enqueue(6);
            
            System.out.println(q.dequeue());  // Removes and prints the front element
            
            while (!q.isEmpty()) {
                System.out.println(q.peek());  // Prints the front element
                q.dequeue();  // Removes the front element
            }
        }
    }
}

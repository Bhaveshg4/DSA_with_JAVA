package Queue.CircularQueue;

public class CircularQueue_Array {
    static class Queue{
        static int arr[];
        static int size;
        static int rear = -1;
        static int front =-1;
        //front is already 0
        Queue(int size){
            arr = new int[size];
            Queue.size = size;
        }
        public static boolean isEmpty(){
            return rear ==  -1 && front ==-1;
        }
        public static boolean isFull(){
            return ((rear+1)% size) ==front;
        }
        ///enqueue
        public void add(int data){
            if (isFull()) {
                System.out.println("Full queue");
                return;
                
            }
            //1st element add
            if (front ==-1) {
                front=0;
                
            }
            rear= (rear+1)%size; //redefining the rear increment logic
            arr[rear] = data;
        }
        //dequeue
        public static int remove(){
            if (isEmpty()) {
                System.out.println("queue empty");
                return -1;
                
            }
            int result = arr[front];
            if (rear==front) {
                rear = front = -1;
                
            }
            else{
                front = (front+1)%size;
            }
            
            return result;

        }
        public static int peek(){
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
                
            }
            return arr[front];
        }
        public static void main(String[] args) {
            Queue q = new Queue(6);
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            q.add(5);
            q.add(6);
            System.out.println(Queue.remove());
            while (!Queue.isEmpty()) {

                System.out.println(Queue.peek());
                Queue.remove();
                
            }


             
        }
    }
   
}

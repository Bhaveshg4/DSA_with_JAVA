package Queue;

public class QueueUsingArray {
    static class Queue{
        static int arr[];
        int size;
        static int rear = -1;
        //front is already 0
        Queue(int size){
            arr = new int[size];
            this.size = size;
        }
        public static boolean isEmpty(){
            return rear ==  -1;
        }
        public void add(int data){
            if (rear == size-1) {
                System.out.println("Full queue");
                return;
                
            }
            rear++;
            arr[rear] = data;
        }
        //dequeue
        public static int remove(){
            if (isEmpty()) {
                return -1;
                
            }
            int front = arr[0];
            for(int i =0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear --;// as we shift all elements to prevoius place so now our rear sohuld also shift to its previous place
            return front;

        }
        public static int peek(){
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
                
            }
            return arr[0];
        }
        public static void main(String[] args) {
            Queue q = new Queue(6);
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            q.add(5);
            q.add(6);
            while (!Queue.isEmpty()) {

                System.out.println(Queue.peek());
                Queue.remove();
                
            }


             
        }
    }
    //time complexity whie implemeting with array:
    //add: O(1)
    //remove: O(n)
    //peek: O(n)
    //fixed size plus more time are reason to not to implement queue with Arrays
}

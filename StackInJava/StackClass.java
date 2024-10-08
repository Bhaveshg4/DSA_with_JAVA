package StackInJava;
//STACK - POP: O(1), PUSH: O(1), PEEK: O(1), Last in first out
//Stack implementation using LinkedList

public class StackClass {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next=null;
        }
    }
    static class Stack{
        public static Node head;
        public static boolean isEmpty(){
            return head == null;        }
        public void push(int data){
            Node newNode = new Node(data);
            if (isEmpty()) {
                    head=newNode;
                    return;
                
                
            }
            newNode.next=head;
            head=newNode;    
        }
        public int pop(){
            if (isEmpty()) {
                return -1;
                
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        public static int peek(){
            if (isEmpty()) {
                return -1;
                
            }
            return head.data;
        }

    }
    public static void main(){
        Stack s = new Stack();
        s.push(0);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while (!Stack.isEmpty()) {
            System.out.println(Stack.peek());
            s.pop();
            
        }
    }

}

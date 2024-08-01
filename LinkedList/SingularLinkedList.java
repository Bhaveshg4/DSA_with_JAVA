package LinkedList;

public class SingularLinkedList {
    Node head;
    private int size;   

    SingularLinkedList(){
        this.size=0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // Add operation: there are two types of add operations: first add and last add
    // Here we are first implementing the first add operation
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // Printing the linked list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " --> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
    //delete first
    public void DeleteFirst(){
        if(head==null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        head = head.next;
    }
    //delete last
    public void deleteLast(){
        if(head==null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        if (head.next==null) {
            head=null;
            return;
            
        }
        Node secondLast = head;
        Node lastNode = head.next; //if head.next = null -> lastNode = null
        while (lastNode.next!=null) {//null.next ->error
            lastNode=lastNode.next;
            secondLast = secondLast.next;
            
        }
        secondLast.next=null;

    }
    public int getSize(){
        return size;
    }

    public static void main(String args[]) {
        SingularLinkedList list = new SingularLinkedList();
        list.addFirst("a");
        list.addFirst("b");
        list.addLast("is");
        list.addLast("list");
        list.addLast("yash");


        list.printList();
        list.deleteLast();
        list.DeleteFirst();
        System.out.println(list.getSize());
    }
}

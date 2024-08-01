package ReversingLinkedList;

public class Reversing {
    Node head;
    private int size;   

    Reversing() {
        this.size = 0;
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

    // Delete first
    public void deleteFirst() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    // Delete last
    public void deleteLast() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public int getSize() {
        return size;
    }
    public void reverseIterate(){
        //corner case
        if(head==null || head.next==null){
            return;
        }
        Node prevNode=head;
        Node currNode= head.next;
        while(currNode!= null){
            Node nexNode = currNode.next;
            currNode.next= prevNode;
            //update
            prevNode=currNode;
            currNode=nexNode;
        }
        head.next=currNode;
        head=prevNode;   }

    public static void main(String args[]) {
        Reversing list = new Reversing();
        list.addFirst("a");
        list.addFirst("b");
        list.addLast("is");
        list.addLast("list");
        list.addLast("yash");

        list.printList();
        list.deleteLast();
        list.deleteFirst();
        System.out.println(list.getSize());
        list.reverseIterate();
        list.printList();
    }
}

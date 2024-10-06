package BinarySearchTree;

public class SearchInBST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.data > val) {
            // Left subtree
            root.left = insert(root.left, val);
        } else {
            // Right subtree
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right); // Corrected to traverse the right subtree
    }
    public static boolean search(Node root, int key){
        if(root==null){
            return false;
        }
        if (root.data>key) {
            return search(root.left, key);
            
        }
        else if(root.data==key){
            return true;
        }
        else{
            return search(root.right,key);
        }
    }

    public static void main(String[] args) {
        int values[] = {5, 1, 3, 4, 2, 7};

        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        System.out.println("Inorder Traversal:");
        inorder(root); // Call inorder traversal to print the tree elements
        if (search(root, 1)) {
            System.out.println("Found");
            
        }else{System.out.println("notfound");}
    }
}

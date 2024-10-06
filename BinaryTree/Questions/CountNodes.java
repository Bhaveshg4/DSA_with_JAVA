package BinaryTree.Questions;

public class CountNodes {
    static class Node {
        int data;
        Node right;
        Node left;
        
        Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            // Base case for null node
            if (idx >= nodes.length || nodes[idx] == -1) {
                return null;
            }

            // Create a new node with current data
            Node newNode = new Node(nodes[idx]);
            
            // Build left subtree first, then right subtree
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            
            return newNode;
        }

        // In-order traversal to print the tree
        public static void inOrderPrint(Node root) {
            if (root == null) {
                return;
            }
            inOrderPrint(root.left); // Traverse left subtree
            System.out.print(root.data + " "); // Print current node's data
            inOrderPrint(root.right); // Traverse right subtree
        }
    }
    public static int countofNode(Node root){
        if (root==null) {
            return 0;
            
        }
        int leftNodes = countofNode(root.left); 
        int rightNodes = countofNode(root.right);
        return leftNodes+rightNodes+1;
    }

    public static void main(String args[]) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = BinaryTree.buildTree(nodes);

        System.out.print("In-Order Traversal of Tree: ");
        BinaryTree.inOrderPrint(root); // Print the tree using in-order traversal
        System.out.print("Total nodes of treee ");

        

        countofNode(root);
    }
}

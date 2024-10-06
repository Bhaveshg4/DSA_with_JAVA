package BinaryTree.Questions;

public class SumofNodes {
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

    // Function to count the total number of nodes in the tree
    public static int countOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftNodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);
        return leftNodes + rightNodes + 1;
    }

    // Function to calculate the sum of all nodes in the tree
    public static int sumOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);
        return leftSum + rightSum + root.data;
    }

    public static void main(String args[]) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = BinaryTree.buildTree(nodes);

        System.out.print("In-Order Traversal of Tree: ");
        BinaryTree.inOrderPrint(root); // Print the tree using in-order traversal
        System.out.println();

        // Calculate and print the total number of nodes in the tree
        int totalNodes = countOfNodes(root);
        System.out.println("Total nodes in the tree: " + totalNodes);

        // Calculate and print the sum of all nodes in the tree
        int totalSum = sumOfNodes(root);
        System.out.println("Sum of all nodes in the tree: " + totalSum);
    }
}

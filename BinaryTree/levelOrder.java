package BinaryTree;
import java.util.*;

public class levelOrder {
    // Print left subtree, then right subtree, and finally the root
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

        public static Node buildtree(int nodes[]) {
            idx++;
            if (idx >= nodes.length || nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildtree(nodes);
            newNode.right = buildtree(nodes);
            return newNode;
        }

        public static void postorder(Node root) {
            if (root == null) {
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }

        public static void LevelOrder(Node root){
            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node currNode = q.remove();
                
                if (currNode == null) {
                    System.out.println(); // End of current level
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null); // Add marker for next level
                    }
                } else {
                    System.out.print(currNode.data + " "); // Print node data with a space
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree.idx = -1; // Reset idx before building the tree
        Node root = BinaryTree.buildtree(nodes);
        System.out.println("Postorder traversal of the binary tree:");
        BinaryTree.postorder(root);
        System.out.println("\nLevel Order traversal of the binary tree:");
        BinaryTree.LevelOrder(root); // Call with BinaryTree reference
    }
}

package BinaryTree;

public class inorderTraversal {
    static class Node {
        int data;
        Node left;
        Node right;
        
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
        //its called preorder because the root comes first , time complexity: O(n)

    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }
    //root in middle
    //rule 1 print left subtree
    //rule 2 print root
    //rule 3 print right root
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data);

        inorder(root.right);

    }
    
    static class BinaryTree {
        static int idx = -1;
        
        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
        
        public static void preorderTraversal(Node root) {
            if (root == null) {
                return;
            }
            // Print the root node data
            System.out.print(root.data + " ");
            // Traverse the left subtree
            preorderTraversal(root.left);
            // Traverse the right subtree
            preorderTraversal(root.right);
        }
    }
    
    public static void main(String args[]) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = BinaryTree.buildTree(nodes);
        System.out.println("Preorder traversal of the binary tree:");
        BinaryTree.preorderTraversal(root);
        inorder(root);
    }
}

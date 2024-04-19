class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTreeTraversal {
    public void preorderTraversal(TreeNode root) {
        if (root == null) return;

        System.out.print(root.val + " "); // Visit the root
        preorderTraversal(root.left);     // Traverse left subtree
        preorderTraversal(root.right);    // Traverse right subtree
    }

    public void inorderTraversal(TreeNode root) {
        if (root == null) return;

        inorderTraversal(root.left);      // Traverse left subtree
        System.out.print(root.val + " "); // Visit the root
        inorderTraversal(root.right);     // Traverse right subtree
    }

    public void postorderTraversal(TreeNode root) {
        if (root == null) return;

        postorderTraversal(root.left);    // Traverse left subtree
        postorderTraversal(root.right);   // Traverse right subtree
        System.out.print(root.val + " "); // Visit the root
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        BinaryTreeTraversal traversal = new BinaryTreeTraversal();

        System.out.println("Preorder traversal:");
        traversal.preorderTraversal(root);

        System.out.println("\nInorder traversal:");
        traversal.inorderTraversal(root);

        System.out.println("\nPostorder traversal:");
        traversal.postorderTraversal(root);
    }
}

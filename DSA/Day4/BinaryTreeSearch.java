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

public class BinaryTreeSearch {
    public boolean search(TreeNode root, int target) {
        if (root == null) {
            return false; 
        }

        if (root.val == target) {
            return true; 
        }

       
        return search(root.left, target) || search(root.right, target);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        BinaryTreeSearch searcher = new BinaryTreeSearch();

        int target = 5;
        if (searcher.search(root, target)) {
            System.out.println("Node with value " + target + " found in the binary tree.");
        } else {
            System.out.println("Node with value " + target + " not found in the binary tree.");
        }
    }
}


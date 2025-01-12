/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Depth_first_search {
    int res = 0;

    // Method to calculate the maximum depth of the binary tree
    public int maxDepth(TreeNode root) {
        CalHeight(root, 1); // Start the calculation with depth 1
        return res;
    }

    // Helper method to calculate the height recursively
    public void CalHeight(TreeNode root, int length) {
        if (root == null) return; // Base case: if the node is null, stop recursion

        // Update the maximum depth found so far
        if (res < length) {
            res = length;
        }

        // Recur to the left and right subtrees
        CalHeight(root.left, length + 1);
        CalHeight(root.right, length + 1);
    }

    public static void main(String[] args) {
        // Create the binary tree
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        // Create an instance of the Depth_first_search class
        Depth_first_search solution = new Depth_first_search();

        // Find the maximum depth of the binary tree
        int maxDepth = solution.maxDepth(root);

        // Print the result
        System.out.println("Maximum Depth of Binary Tree: " + maxDepth);
    }
}

// Definition for a binary tree node
class TreeNode {
    int val;            // Value of the node
    TreeNode left;      // Pointer to the left child
    TreeNode right;     // Pointer to the right child

    // Default constructor
    TreeNode() {}

    // Constructor to set the value of the node
    TreeNode(int val) { 
        this.val = val; 
    }

    // Constructor to set the value and children of the node
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

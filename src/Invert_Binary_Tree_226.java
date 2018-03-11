import Helper.TreeNode;

/**
 * @author Mert Ozer
 * Invert a binary tree.

 */
public class Invert_Binary_Tree_226 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return root;
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        root.left = right;
        root.right = left;

        return root;
    }
}

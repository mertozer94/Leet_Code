import Helper.TreeNode;
/**
 * @author Mert Ozer
Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down
to the farthest leaf node.

For example:
Given binary tree [3,9,20,null,null,15,7],
 */

public class Maximum_Depth_of_Binary_Tree_104 {
    public static void main(String[] args){

    }
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}

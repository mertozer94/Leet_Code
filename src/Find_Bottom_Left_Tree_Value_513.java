import Helper.TreeNode;

/**
 * @author Mert Ozer
 * Given a binary tree, find the leftmost value in the last row of the tree.

Example 1:
Input:

2
/ \
1   3

Output:
1
Example 2:
Input:

1
/ \
2   3
/   / \
4   5   6
/
7

Output:
7
Note: You may assume the tree (i.e., the given root node) is not NULL.
 */
public class Find_Bottom_Left_Tree_Value_513 {
    public static int maxlevel = 0;
    public static int bottomleftvalue = 0;
    public int findBottomLeftValue(TreeNode root) {
        helper(root, 1);
        return bottomleftvalue;
    }
    public void helper(TreeNode root, int depth) {
        if (maxlevel < depth) {
            maxlevel++;
            bottomleftvalue = root.val;
        }
        if (root.left != null)
            helper(root.left, depth + 1);
        if (root.right != null)
            helper(root.right, depth + 1);
    }
}

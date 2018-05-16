import Helper.TreeNode;

/**
 * @author Mert Ozer
 *
 *
 * Given a binary tree, determine if it is height-balanced.

For this problem, a height-balanced binary tree is defined as:

a binary tree in which the depth of the two subtrees of every node never differ by more than 1.

Example 1:

Given the following tree [3,9,20,null,null,15,7]:

3
/ \
9  20
/  \
15   7
Return true.

Example 2:

Given the following tree [1,2,2,3,3,null,null,4,4]:

1
/ \
2   2
/ \
3   3
/ \
4   4
Return false.



 */
public class Balanced_Binary_Tree_110 {
    public static boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;
        int leftHight = heightOfNode(root.left);
        int rightHight = heightOfNode(root.right);

        if (Math.abs(leftHight - rightHight) > 1)
            return false;

        return isBalanced(root.left) && isBalanced(root.right);
    }
    public static int heightOfNode(TreeNode root){
        if (root == null)
            return 0;

        return Math.max(heightOfNode(root.left)+1,heightOfNode(root.right)+1);
    }
    public static void main(String[] args){
        TreeNode root = TreeNode.createTree();
        System.out.println(isBalanced(root));
    }
}

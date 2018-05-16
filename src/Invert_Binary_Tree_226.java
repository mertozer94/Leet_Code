import Helper.TreeNode;

/**
 * @author Mert Ozer
 * Invert a binary tree.

 */
public class Invert_Binary_Tree_226 {
    public static void main(String[] args){
        TreeNode node = new TreeNode(4);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(7);
        TreeNode node3 = new TreeNode(1);
        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(6);
        TreeNode node6 = new TreeNode(9);

        node.left = node1;
        node.right = node2;

        node1.left = node3;
        node1.right = node4;


        node2.left = node5;
        node2.right = node6;

        TreeNode newNode = invertTree(node);
        System.out.println("");
    }
    public static TreeNode invertTree(TreeNode root) {
        if (root == null)
            return root;
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        root.left = right;
        root.right = left;

        return root;
    }
}

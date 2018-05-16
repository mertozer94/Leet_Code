package Helper;

/**
 * @author Mert Ozer
 */
public class TreeNode {
      public int val;
      public TreeNode left;
      public TreeNode right;
      public TreeNode(int x) { val = x; }

      public static TreeNode createTree(){
            TreeNode root = new TreeNode(3);
            TreeNode one = new TreeNode(9);
            TreeNode two = new TreeNode(20);
            TreeNode three = new TreeNode(15);
            TreeNode four = new TreeNode(7);
            root.left = one;
            root.right = two;
            two.left = three;
            two.right = four;
            return root;
      }
}

import Helper.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Mert Ozer
 * You need to find the largest value in each row of a binary tree.

Example:
Input:

1
/ \
3   2
/ \   \
5   3   9

Output: [1, 3, 9]
 */
public class Find_Largest_Value_in_Each_Tree_Row_515 {
    public List<Integer> largestValues(TreeNode root) {
        if(root == null)
            return new ArrayList();
        Queue<TreeNode> q = new LinkedList();
        List<Integer> result = new ArrayList();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            int maxVal = Integer.MIN_VALUE;
            for(int i = 0; i < size; i++){
                TreeNode node = q.remove();
                maxVal = Math.max(node.val, maxVal);
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }
            result.add(maxVal);
        }
        return result;
    }
}

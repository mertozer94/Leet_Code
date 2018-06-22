import Helper.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Mert Ozer
 * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

For example:
Given binary tree [3,9,20,null,null,15,7],
3
/ \
9  20
/  \
15   7
return its level order traversal as:
[
[3],
[9,20],
[15,7]
]
 */
public class Binary_Tree_Level_Order_Traversal_102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null)
            return new ArrayList();
        Queue<TreeNode> q = new LinkedList();
        List<List<Integer>> result = new ArrayList();

        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> listLevel = new ArrayList();
            for(int i = 0; i < size; i++){
                TreeNode node = q.remove();
                if(node.left != null)q.offer(node.left);
                if(node.right != null)q.offer(node.right);
                listLevel.add(node.val);
            }
            result.add(listLevel);
        }
        return result;
    }
}

import Helper.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Mert Ozer
 *
 * Given a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.

Example:

Input: [1,2,3,null,5,null,4]
Output: [1, 3, 4]
Explanation:

1            <---
/   \
2     3         <---
\     \
5     4       <---

 */
public class Binary_Tree_Right_Side_View_199 {
    public List<Integer> rightSideView(TreeNode root) {
        if(root == null)
            return new LinkedList();
        List<Integer> result = new ArrayList();
        Queue<TreeNode> q = new LinkedList();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size; i++){
                TreeNode node = q.remove();
                if(i == 0)
                    result.add(node.val);
                if(node.right != null)q.add(node.right);
                if(node.left != null)q.add(node.left);
            }

        }
        return result;
    }
}

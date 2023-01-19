package Easy;

import Library.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BT_Preorder_Traversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        return dfsPreOrder(root, new ArrayList());
    }

    private List<Integer> dfsPreOrder(TreeNode root, List<Integer> list){
        List<Integer> l = list;
        if(root == null)
            return list;
        else{
            list.add(root.val);
            dfsPreOrder(root.left, l);
            dfsPreOrder(root.right, l);
        }
        return l;
    }
}

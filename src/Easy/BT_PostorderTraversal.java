package Easy;

import Library.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BT_PostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        return dfsPostOrder(root, new ArrayList());
    }

    private List<Integer> dfsPostOrder(TreeNode root, List<Integer> list){
        List<Integer> l = list;
        if(root == null)
            return list;
        else{
            dfsPostOrder(root.left, l);
            dfsPostOrder(root.right, l);
            l.add(root.val);
        }
        return list;
    }
}

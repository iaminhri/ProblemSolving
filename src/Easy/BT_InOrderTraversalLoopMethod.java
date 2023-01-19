package Easy;

import Library.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BT_InOrderTraversalLoopMethod {
    public List<Integer> inOrderTraversal(TreeNode root) {
        return dfsInOrder(root, new ArrayList());
    }

    private List<Integer> dfsInOrder(TreeNode root, ArrayList<Integer> list){

        TreeNode curr = root;
        Stack<TreeNode> stack = new Stack<TreeNode>();

        if(root == null)
            return list;
        else{
            while(curr != null || stack.size() > 0){
                while(curr != null){
                    stack.push(curr);
                    curr = curr.left;
                }

                curr = stack.pop();
                list.add(curr.val);

                curr = curr.right;
            }
        }
        return list;
    }
}

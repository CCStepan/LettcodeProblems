package BinaryTreeInorderTraversal;
// Решение с помощью стека


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import BinaryTreeInorderTraversal.TreeNode;


public class Solution2 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode r = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        r.left.left = new TreeNode(4);
        r.left.right = new TreeNode(5, new TreeNode(6), new TreeNode(7));
        r.right = new TreeNode(8);
        r.right.right = new TreeNode(9);

        System.out.println(solution.inorderTraversal(r));
    }



    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            res.add(curr.val);
            curr = curr.right;
        }
        return res;
    }
}
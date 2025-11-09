package BinaryTreeInorderTraversal;
// Рекурсивное решение


import java.util.ArrayList;
import java.util.List;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode r = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        r.left.left = new TreeNode(4);
        r.left.right = new TreeNode(5, new TreeNode(6), new TreeNode(7));
        r.right = new TreeNode(8);
        r.right.right = new TreeNode(9);

        System.out.println(solution.inorderTraversal(r));
    }

    public void f(TreeNode root, List<Integer> res) {
        if (root != null) {

            f(root.left, res);

            res.add(root.val);

            System.out.println(root.val);
            f(root.right, res);
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        f(root, res);
        return res;
    }
}
/*
import java.util.ArrayList;
import java.util.List;

*/
/**
 * Definition for a binary tree node.
 *//*


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}


class Solution {
    public static void main(String[] args) {
        List<Integer> vals = new Solution().preorderTraversal();
    }


    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> vals = new ArrayList<>();
        while (root.left != null)
            root = root.left;
        vals.add(root.val);
        return vals;
    }
}*/

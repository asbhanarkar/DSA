/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        return rec(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    boolean rec(TreeNode root, long min, long max){
        if(root == null){
            return true;
        }

        long curr = root.val;

        if(curr >= min && curr <= max){
            return rec( root.left, min, curr - 1) && rec(root.right, curr + 1, max);
        }
        return false;
    }
}
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

    boolean ans;
    void recur(TreeNode root, int sum){
        if(root == null){return;}
        if(ans == true){return;}
        sum -= root.val;
        if(root.left == root.right && sum == 0){
            ans = true;
        }
        recur(root.left, sum);
        recur(root.right, sum);
        return;
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }
        recur(root, targetSum);
        return ans;
    }
}
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
    int K ;
    int ans = -1;
    public int kthSmallest(TreeNode root, int k) {
        K = k;
        recur(root);
        return ans;
    }

    void recur(TreeNode root){
        if(root == null){
            return;
        }
        recur(root.left);
        K--;
        if(K == 0){
            ans = root.val;
            return;
        }
        recur(root.right);
        return;

    }
}
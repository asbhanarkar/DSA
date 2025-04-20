/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int val = root.val;
        if(val > p.val && val > q.val){
            return lowestCommonAncestor(root.left, p, q);
        }
        if(val < p.val && val < q.val){
            return lowestCommonAncestor(root.right, p,q);
        }

        return root;
    }
}
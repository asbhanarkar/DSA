/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        Queue<TreeNode> que = new LinkedList<>();
        StringBuilder str = new StringBuilder();

        if(root == null){
            return str.toString();
        }
        que.add(root);
        while(!que.isEmpty()){
            int n = que.size();
            for(int i = 0; i < n; i++){
                TreeNode curr = que.poll();
                if(curr == null){
                    str.append("n ");
                    continue;
                }
            
                str.append(curr.val).append(" ");
                que.add(curr.left);
                que.add(curr.right);
                
            }
        }
        return str.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.length() == 0){
            return null;
        }
        String list[] = data.split(" ");
        Queue<TreeNode> que = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.parseInt(list[0]));
        que.add(root);

        for(int i = 1; i < list.length; i++){
            TreeNode p = que.poll();
            if(!list[i].equals("n")){
                TreeNode left = new TreeNode(Integer.parseInt(list[i]));
                p.left = left;
                que.add(left);
            }
            if(!list[++i].equals("n")){
                TreeNode right = new TreeNode(Integer.parseInt(list[i]));
                p.right = right;
                que.add(right);
            }
        }
        return root;

    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
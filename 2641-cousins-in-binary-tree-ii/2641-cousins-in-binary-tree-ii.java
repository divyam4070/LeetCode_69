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
    public TreeNode replaceValueInTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();    
        queue.offer(root);
        ArrayList<Integer> levelSum = new ArrayList<>();
        while(!queue.isEmpty()){
            int size = queue.size();
            int sum = 0;
            for(int i=0; i<size;i++){
                TreeNode node = queue.poll();
                sum+=node.val;
                if(node.left!=null){
                    queue.offer(node.left);

                }
                if(node.right!=null){
                    queue.offer(node.right);
                    
                }
            }
            levelSum.add(sum);
        }
        queue.offer(root);
        int level = 0;
        root.val = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            
            for(int i=0; i<size;i++){
                int sum = 0;
                TreeNode node = queue.poll();
                // sum+=node.val;
                if(node.left!=null){
                    sum+=node.left.val;

                }
                if(node.right!=null){
                    sum+=node.right.val;
                    
                }
                if(node.left!=null){
                    node.left.val = levelSum.get(level+1)-sum;
                    queue.offer(node.left);
                    

                }
                if(node.right!=null){
                    node.right.val = levelSum.get(level+1)-sum;
                    queue.offer(node.right);
                    
                }
            }
            level++;
        }
        return root;


    }
}
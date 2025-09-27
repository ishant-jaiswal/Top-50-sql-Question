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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        boolean flag=true;
        while(!q.isEmpty()){
            int levelSize=q.size();
            LinkedList<Integer> list=new LinkedList<>();
            for(int i=0;i<levelSize;i++){
                TreeNode node=q.poll();
                if(flag){
                    list.addLast(node.val);
                }
                else{
                    list.addFirst(node.val);
                }

                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
            }
            flag=!flag;
            result.add(new ArrayList<>(list));
        }
        return result;
    }
}
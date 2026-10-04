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
    public int diameterOfBinaryTree(TreeNode root) {
        HashMap<TreeNode, Integer> map=new HashMap<>();
        Stack <TreeNode> s=new Stack<>();
        s.push(root);
        int diameter =0;
        while(!s.isEmpty()){
            TreeNode node=s.peek();
            if(node.left!=null && !map.containsKey(node.left) ){
                s.push(node.left);
            }
            else if(node.right!=null && !map.containsKey(node.right) ){
                s.push(node.right);
            }
            else{
                node=s.pop();
                int leftdepth =(map.getOrDefault(node.left, 0));
                int rightdepth = map.getOrDefault(node.right,0);
                map.put(node, 1+Math.max(leftdepth, rightdepth));
            
            diameter = Math.max(diameter, leftdepth+rightdepth);
                
           }
        }
        return diameter;
    }
}

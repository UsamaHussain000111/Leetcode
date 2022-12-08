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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {

        List<Integer> leafNodes1 = new ArrayList<Integer>();
        List<Integer> leafNodes2 = new ArrayList<Integer>();

        helper(root1 , leafNodes1);
        helper(root2 , leafNodes2);

        return leafNodes1.equals(leafNodes2);

    }

    void helper(TreeNode node , List<Integer> list){
        
        if(node == null)
        return;

        if(node.left == null && node.right == null){
            list.add(node.val);
        else{
            helper(node.left , list);
            helper(node.right , list);
        }
    }
}
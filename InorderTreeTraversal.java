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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if (root != null) {
            helper(root, list);
        }
        
        return list;
    }
    
    private void helper(TreeNode curr, List<Integer> list) {
        if (curr != null) {
            helper(curr.left, list);
            list.add(curr.val);
            helper(curr.right, list);
        }
    }
}

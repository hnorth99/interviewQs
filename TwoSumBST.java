class Solution {
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> s = new HashSet<Integer>();
        return helper(root, k, s);
    }
    
    private boolean helper(TreeNode curr, int k, Set<Integer> s) {
        if (curr == null) {
            return false;
        } else if (s.contains(curr.val)) {
            return true;
        } else {
            s.add(k - curr.val);
            return (helper(curr.left, k, s) || 
                   helper(curr.right, k, s));
        }
    }
}

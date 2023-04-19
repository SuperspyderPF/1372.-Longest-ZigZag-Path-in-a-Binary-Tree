class Solution {
    public int longestZigZag(TreeNode root) {
        int[] res = new int[1];
        dfs(root, true, 0, res);
        dfs(root, false, 0, res);
        return res[0];
    }
    
    void dfs(TreeNode node, boolean is_left, int count, int[] res) {
        if (node != null) {
            res[0] = Math.max(res[0], count);
            if (is_left) {
                dfs(node.left, false, 1, res);
                dfs(node.right, true, count+1, res);
            } else {
                dfs(node.right, true, 1, res);
                dfs(node.left, false, count+1, res);
            }
        }
    }
}

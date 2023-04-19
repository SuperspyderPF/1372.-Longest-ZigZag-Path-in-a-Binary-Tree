class Solution {
    var res = 0
    fun longestZigZag(root: TreeNode?): Int {
        dfs(root, true, 0)
        dfs(root, false, 0)
        return res
    }
    
    fun dfs(node: TreeNode?, is_left: Boolean, count: Int) {
        if (node != null) {
            res = maxOf(res, count)
            if (is_left) {
                dfs(node.left, false, 1)
                dfs(node.right, true, count+1)
            } else {
                dfs(node.right, true, 1)
                dfs(node.left, false, count+1)
            }
        }
    }
}

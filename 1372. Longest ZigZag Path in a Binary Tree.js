/**
 * @param {TreeNode} root
 * @return {number}
 */
var longestZigZag = function(root) {
    let res = 0;
    
    function dfs(node, is_left, count) {
        if (node) {
            res = Math.max(res, count);
            if (is_left) {
                dfs(node.left, false, 1);
                dfs(node.right, true, count+1);
            } else {
                dfs(node.right, true, 1);
                dfs(node.left, false, count+1);
            }
        }
    }
    
    dfs(root, true, 0);
    dfs(root, false, 0);
    return res;
};

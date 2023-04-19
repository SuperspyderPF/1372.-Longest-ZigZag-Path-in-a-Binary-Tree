class Solution {
public:
    int longestZigZag(TreeNode* root) {
        int res = 0;
        dfs(root, true, 0, res);
        dfs(root, false, 0, res);
        return res;
    }
    
    void dfs(TreeNode* node, bool is_left, int count, int& res) {
        if (node) {
            res = max(res, count);
            if (is_left) {
                dfs(node->left, false, 1, res);
                dfs(node->right, true, count+1, res);
            } else {
                dfs(node->right, true, 1, res);
                dfs(node->left, false, count+1, res);
            }
        }
    }
};

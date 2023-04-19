class Solution:
    def longestZigZag(self, root: Optional[TreeNode]) -> int:
        self.res = 0
        def dfs(node, is_left, count):
            if node:
                self.res = max(self.res, count)
                if is_left:
                    dfs(node.left, False, 1)
                    dfs(node.right, True, count+1)
                else:
                    dfs(node.right, True, 1)
                    dfs(node.left, False, count+1)
        dfs(root, True, 0)
        dfs(root, False, 0)
        return self.res

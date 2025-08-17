package org.example.tree.invert_binary_tree;

import org.example.tree.tree_utils.TreeFactory;
import org.example.tree.tree_utils.TreeNode;

import java.util.List;

public class Solution {
    public static void main(String[] args) {
        TreeNode tree = TreeFactory.createTree(List.of(1,2,3,4,5,6,7,8,9,10));
        TreeFactory.inorderDfs(tree);

        Solution solution = new Solution();
        solution.swapChildNodes(tree);

        TreeFactory.inorderDfs(tree);
    }
    private void swapChildNodes(TreeNode root) {
        if (root == null) return;

        
    }
}

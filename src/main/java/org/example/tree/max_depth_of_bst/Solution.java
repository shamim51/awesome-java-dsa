package org.example.tree.max_depth_of_bst;

import org.example.tree.tree_utils.TreeFactory;
import org.example.tree.tree_utils.TreeNode;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {

        TreeNode tree = TreeFactory.createTreeFromLevelOrder(Arrays.asList(4, 2, 7, 1, 3, 6, 9));
        Solution solution = new Solution();
        System.out.println(solution.maxDepth(tree));
    }

    public Integer maxDepth(TreeNode node) {
        if(node ==  null) return 0;

        int rightSubTreeValue = maxDepth(node.getRight());
        int leftSubTreeValue = maxDepth(node.getLeft());

        return Math.max(rightSubTreeValue, leftSubTreeValue) + 1;
    }

}

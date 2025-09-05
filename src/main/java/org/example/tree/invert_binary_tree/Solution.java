package org.example.tree.invert_binary_tree;

import org.example.tree.tree_utils.TreeFactory;
import org.example.tree.tree_utils.TreeNode;

import java.util.List;

public class Solution {
    public static void main(String[] args) {
        TreeNode tree = TreeFactory.createTree(List.of(6, 5, 8, 7, 9, 3, 4));

        System.out.println("PRINTING TREE IN PREORDER, BEFORE INVERTED ORDER");
        TreeFactory.preorderDfs(tree);

        Solution solution = new Solution();
        solution.invertTree(tree);

        System.out.println("PRINTING TREE FOR PREORDER, AFTER INVERTED ORDER");
        TreeFactory.preorderDfs(tree);

    }
    private void invertTree(TreeNode root) {
        if (root == null) return;

        invertChild(root);

        invertTree(root.getLeft());
        invertTree(root.getRight());

    }

    private static void invertChild(TreeNode root) {
        TreeNode tempLeft = root.getLeft();
        root.setLeft(root.getRight());
        root.setRight(tempLeft);
    }
}

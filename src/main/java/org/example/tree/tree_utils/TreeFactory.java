package org.example.tree.tree_utils;

import java.util.List;

public class TreeFactory {
    public static void main(String[] args) {

        TreeNode tree = TreeFactory.createTree(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        TreeFactory.preorderDfs(tree);
    }

    public static TreeNode createTree(List<Integer> values){

        TreeNode root = null;
        for(int value : values){
            root = insertTreeNode(root, value);
        }

        return root;
    }

    private static TreeNode insertTreeNode(TreeNode root, int value) {
        if (root == null) return new TreeNode(value);

        if(root.getVal() == value) return root;

        if(value > root.getVal()) root.setRight(insertTreeNode(root.getRight(), value));

        else root.setLeft(insertTreeNode(root.getLeft(), value));

        return root;
    }

    public static void preorderDfs(TreeNode root){
        if (root == null) return;
        System.out.println(root.getVal());
        preorderDfs(root.getLeft());
        preorderDfs(root.getRight());
    }

    public static void inorderDfs(TreeNode root){
        if (root == null) return;

        inorderDfs(root.getLeft());
        System.out.println(root.getVal());
        inorderDfs(root.getRight());

    }
    public static void postorderDfs(TreeNode root){
        if (root == null) return;
        postorderDfs(root.getLeft());
        postorderDfs(root.getRight());
        System.out.println(root.getVal());
    }
}

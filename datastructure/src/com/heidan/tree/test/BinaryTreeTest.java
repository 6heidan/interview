package com.heidan.tree.test;

import com.heidan.tree.BinaryTree;
import com.heidan.tree.TreeNode;

public class BinaryTreeTest {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        TreeNode root = new TreeNode(1);
        binaryTree.setRoot(root);
        TreeNode rootL = new TreeNode(2);
        TreeNode rootR = new TreeNode(3);
        root.setLeftNode(rootL);
        root.setRightNode(rootR);

        rootL.setLeftNode(new TreeNode(4));
        rootL.setRightNode(new TreeNode(5));
        rootR.setLeftNode(new TreeNode(6));
        rootR.setRightNode(new TreeNode(7));

        binaryTree.frontShow();
        System.out.println("==========");
        binaryTree.midShow();
        System.out.println("==========");
        binaryTree.afterShow();

        TreeNode result = binaryTree.frontSearch(5);
        System.out.println(result);

        System.out.println("==========");
        binaryTree.delete(1);
        binaryTree.frontShow();

        
    }

}

package com.heidan.tree03;

public class TestThreadedBinaryTree {
    public static void main(String[] args) {
        ThreadedBinaryTree threadedBinaryTree = new ThreadedBinaryTree();

        ThreadedNode root = new ThreadedNode(1);
        threadedBinaryTree.setRoot(root);
        ThreadedNode rootL = new ThreadedNode(2);
        root.setLeftNode(rootL);
        ThreadedNode rootR = new ThreadedNode(3);
        root.setRightNode(rootR);
        rootL.setLeftNode(new ThreadedNode(4));
        ThreadedNode fiveNode = new ThreadedNode(5);
        rootL.setRightNode(fiveNode);
        rootR.setLeftNode(new ThreadedNode(6));
        rootR.setRightNode(new ThreadedNode(7));

        threadedBinaryTree.midShow();
        System.out.println("====================");
        //中序线索化二叉树
        threadedBinaryTree.threadNodes();
        threadedBinaryTree.threadIterate();


    }


}

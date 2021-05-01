package com.heidan.chapter1.one;

//基本的二叉树节点
public class TreeNode {
    int val;
    TreeNode left,right;

    void traverse(TreeNode root){
        //前序遍历
        traverse(root.left);
        //中序遍历
        traverse(root.right);
        //后序遍历
    }
}

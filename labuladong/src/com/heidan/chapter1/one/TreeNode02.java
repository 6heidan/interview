package com.heidan.chapter1.one;

//基本的N叉树节点
public class TreeNode02 {
    int val;
    TreeNode02[] children;

    void traverse(TreeNode02 root){
        for (TreeNode02 child:root.children){
            traverse(child);
        }
    }

}

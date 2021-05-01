package com.heidan.tree03;

public class ThreadedBinaryTree {
    ThreadedNode root;
    //临时存储前驱节点
    ThreadedNode pre = null;

    public void setRoot(ThreadedNode root){
        this.root = root;
    }
    public ThreadedNode getRoot(){
        return root;
    }

    //遍历线索二叉树
    public void threadIterate(){
        ThreadedNode node = root;
        while (node!=null){
            while (node.leftType==0){
                node = node.leftNode;
            }
            System.out.println(node.value);
            while (node.rightType==1){
                node = node.rightNode;
                System.out.println(node.value);
            }
            node = node.rightNode;
        }
    }

    //中序线索化二叉树
    public void threadNodes(){
        threadNodes(root);
    }

    public void threadNodes(ThreadedNode node){
        if (node==null){
            return;
        }
        threadNodes(node.leftNode);
        if (node.leftNode==null){
            node.leftNode=pre;
            node.leftType=1;
        }
        //处理前驱的右指针，如果前驱节点的右指针是null
        if (pre!=null && pre.rightNode==null){
            //让前驱节点的右指针指向当前节点
            pre.rightNode=node;
            pre.rightType=1;
        }
        //每处理一个节点，当前节点是下一个节点的前驱节点
        pre = node;
        threadNodes(node.rightNode);
    }

    public void frontShow(){
        if (root!=null){
            root.frontShow();
        }
    }

    public void midShow(){
        if (root!=null){
            root.midShow();
        }
    }

    public void afterShow(){
        if (root!=null){
            root.afterShow();
        }
    }

    public ThreadedNode frontSearch(int i){
        return root.frontSearch(i);
    }

    public void delete(int i){
        if (root.value==i){
            root = null;
        }else {
            root.delete(i);
        }
    }

}

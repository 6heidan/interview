package com.heidan.chapter1.one;

//链表遍历框架，兼具迭代和递归结构
public class ListNode {
    int val;
    ListNode next;

    void traverse(ListNode head){
        for (ListNode p = head; p!=null; p=p.next){
            //迭代遍历p.val
        }
    }

    void traverse1(ListNode head){
        //前序遍历head.val
        traverse1(head.next);
        //后续遍历head.val
    }

}

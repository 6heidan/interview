package com.heidan.datastructure;

/**
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 *
 * 输入: 1->1->2->3->3
 * 输出: 1->2->3
 */
public class DeletePublicElement {
    public ListNode deletePublicElement(ListNode head){
        if (head==null && head.next==null){
            return head;
        }
        head.next = deletePublicElement(head.next);
        if (head.val==head.next.val){
            head = head.next;
        }
        return head;
    }
}


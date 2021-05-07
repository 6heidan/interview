package com.heidan.leetcode;

public class ReverseList {
    static class ListNode{
        int val;
        ListNode next;
        public ListNode(int val,ListNode next){
            this.val = val;
            this.next = next;
        }
    }
    /**
     * 反转链表（迭代）
     * 1、保存下一个节点
     * 2、把前一个节点赋值给下一个节点
     * 3、把当前节点赋值给前一个节点
     * 4、把下一个节点赋值给当前节点
     */
    public static ListNode iterate(ListNode head){
        ListNode prev=null,next;
        ListNode current = head;
        while (current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    //递归
    public static ListNode recursion(ListNode head){
        if (head == null || head.next == null){
            return head;
        }
        ListNode newHead = recursion(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        ListNode node5 = new ListNode(5,null);
        ListNode node4 = new ListNode(4,node5);
        ListNode node3 = new ListNode(3,node4);
        ListNode node2 = new ListNode(2,node3);
        ListNode node1 = new ListNode(1,node2);
//        ListNode prev = iterate(node1);
        ListNode recursion = recursion(node1);
        System.out.println(recursion);
    }
}


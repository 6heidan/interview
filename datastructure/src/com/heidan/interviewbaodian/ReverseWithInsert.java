package com.heidan.interviewbaodian;

public class ReverseWithInsert {
    //时间复杂度：O(n)    与方法一和方法二相比，效率更高
    public static void Reverse(LNode head){
        //判断链表是否为空
        if (head==null || head.next==null){
            return;
        }
        LNode cur = null; //当前节点
        LNode next = null; //后继节点
        cur = head.next.next;
        //设置链表第一个节点为尾结点
        head.next.next = null;
        //把遍历到节点插入到头结点的后面
        while (cur!=null){
            next = cur.next;
            cur.next = head.next;
            head.next = cur;
            cur = next;
        }
    }
}

package com.heidan.interviewbaodian;

//实现链表的逆序
public class ReverseList {
    public static void main(String[] args) {
        //链表头节点
        LNode head = new LNode();
        head.next = null;
        LNode tmp = null;
        LNode cur = head;
        //构造单链表
        for (int i = 0; i < 8; i++) {
            tmp = new LNode();
            tmp.data = i;
            tmp.next = null;
            cur.next = tmp;
            cur = tmp;
        }
        System.out.print("逆序前：");
        for (cur=head.next;cur!=null;cur=cur.next){
            System.out.print(cur.data + " ");
        }
        System.out.print("\n逆序后：");
        Reverse(head);
        for (cur=head.next;cur!=null;cur=cur.next){
            System.out.print(cur.data + " ");
        }
    }

    //时间复杂度：O(n)        空间复杂度：O(1)
    public static void Reverse(LNode head){
        if (head==null || head.next==null){
            return;
        }
        LNode pre = null;//前驱节点
        LNode cur = null;//当前节点
        LNode next = null;//后继节点
        //把链表首节点变成尾节点
        cur = head.next;
        next = cur.next;
        cur.next = null;
        pre = cur;
        cur = next;
        //使当前遍历到的节点cur指向其前驱节点
        while (cur.next!=null){
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = cur.next;
            cur = next;
        }
        //节点最后一个节点指向倒数第二个节点
        cur.next = pre;
        //链表的头节点指向原来链表的尾节点
        head.next = cur;
    }



}

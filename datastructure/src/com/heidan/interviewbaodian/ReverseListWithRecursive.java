package com.heidan.interviewbaodian;

public class ReverseListWithRecursive {
    /**
     * 方法功能：对不带头结点的单链表进行逆序
     * 输入参数：firstRef：链表头节点
     * 时间复杂度：O(n)
     */
    private static LNode RecursiveReverse(LNode head){
        //如果链表为空或者链表中只有一个元素
        if (head==null || head.next==null){
            return head;
        }else {
            //反转后面的节点
            LNode newHead = RecursiveReverse(head.next);
            //把当前遍历的节点加到后面节点逆序后链表的尾部
            head.next.next = head;
            head.next = null;
            return newHead;
        }
    }

    /**
     * 方法功能：对带头结点的单链表进行逆序
     * @param head：链表头节点
     * @return
     */
    public static void Reverse(LNode head){
        if (head==null){
            return;
        }
        //获取链表第一个节点
        LNode firstNode = head.next;
        //对链表进行逆序
        LNode newHead = RecursiveReverse(firstNode);
        //头结点指向逆序后链表的第一个节点
        head.next = newHead;
    }
}

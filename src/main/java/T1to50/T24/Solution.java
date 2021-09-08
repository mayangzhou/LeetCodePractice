package T1to50.T24;

import T1to50.T21.ListNode;

public class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null){
            return null;
        }
        ListNode realHead = new ListNode();
        realHead.next =head;
        ListNode current = realHead;
        ListNode pre,first,second,after;

        while(current.next != null && current.next.next != null){
            pre = current;
            first = current.next;
            second = current.next.next;


            pre.next = second;
            first.next = second.next;
            second.next =first;
            current = first; //下一个pre
        }
        return realHead.next;
    }
}

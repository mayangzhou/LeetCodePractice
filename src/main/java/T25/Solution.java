package T25;

import Utils.ListNode;

public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode realHead = new ListNode();
        realHead.next =head;
        ListNode start = head,end =null,current = realHead,next = null,pre = realHead;
        while (current.next != null){
            for (int i = 0; i < k && current.next != null; i++) {
                current = current.next;
            }
            if (current.next == null){
                break;
            }
            start = pre.next;
            next = current.next;
            current.next =null;//方便后续判断
            pre.next = reverse(start);
            start.next = next;

            pre = start;
            current = pre;

        }

        return realHead.next;
    }

//    public void exchange(ListNode pre){
//        if (pre.next != null && pre.next.next != null){
//            ListNode first = pre.next;
//            ListNode second = first.next;
//            //exchange
//            pre.next = second;
//            first.next = second.next;
//            second.next = first;
//        }
//    }
    public ListNode reverse(ListNode start){
        ListNode pre =null;
        ListNode next = null;
        ListNode current = start;
        while (current.next != null){
            next = current.next;
            current.next = pre;
            pre =current;
            current =next;
        }
        return pre;
    }
}

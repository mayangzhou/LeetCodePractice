package T1to50.T19;

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            if (head == null){
                return  null;
            }
            ListNode realHead = new ListNode();
            realHead.next =head;
            ListNode current = realHead;
            ListNode second =realHead;
            for (int i = 0; i < n; i++) {
                if (current.next!= null){
                    current = current.next;
                }
            }
            while (current.next != null){
                current = current.next;
                second = second.next;
            }
            second.next =second.next.next;

            return realHead.next;
        }
    }

package T51to100.T61;

import Utils.ListNode;

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
    public ListNode rotateRight(ListNode head, int k) {
        //先遍历一遍链表 获取长度
        ListNode current = head;
        if (head == null) return null;
        int count =1;
        while (current.next!= null){
            current = current.next;
            count++;
        }
        current.next = head;
        k = k%count;
//        ListNode fast = head;
//        ListNode slow = head;
//        for (int i = 0; i < count; i++) {
//            fast = fast.next;
//        }
        current = head;
        for (int i = 0; i < count-k-1; i++) {
            current = current.next;
        }
        ListNode res = current.next;
        current.next = null;
        return res;
    }
}

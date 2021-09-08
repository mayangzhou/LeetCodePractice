package T1to50.T23;

import T1to50.T21.ListNode;

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
    public ListNode mergeKLists(ListNode[] lists) {
        int len = lists.length;
        if (len == 0){
            return null;
        }else if (len == 1){
            return lists[0];
        }else {
            return mergeTwoList(0,len-1,lists);
        }


    }

    public ListNode utilMerge(ListNode left , ListNode right){
        ListNode head = new ListNode();
        ListNode current = head;
        if ( left == null) return right;
        if ( right == null) return left;
        while (left != null && right!= null){
            if (left.val < right.val){
                current.next = left;
                left = left.next;
            }else {
                current.next =right;
                right = right.next;
            }
            current = current.next;
        }
        if (left == null){
            current.next = right;
        }else {
            current.next =left;
        }
        return head.next;
    }

    public ListNode mergeTwoList(int i, int j ,ListNode[] lists){
        if (j-i == 1){
            return utilMerge(lists[i],lists[j]);
        }else if ( j == i){
            return lists[i];
        }else {
            return utilMerge(mergeTwoList(i,(i+j)/2,lists),mergeTwoList((i+j)/2+1,j,lists));
        }
    }
}

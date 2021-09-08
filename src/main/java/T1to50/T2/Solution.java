package T1to50.T2;
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int result = 0;
        int acc = 0; // 进位
        int i=0;//表示位数 十 百
        ListNode head = new ListNode();
        ListNode ref = head;
        while(l1 != null || l2 != null){
            ListNode l3= new ListNode();

            int tmpSum = 0;//位数和

            if (l1 != null){
             tmpSum += l1.val;
            }
            if (l2 != null){
                tmpSum += l2.val;
            }
            tmpSum += acc;
            //int tmp1 = tmpSum % 10;
            if (tmpSum == 10){
                l3.val = 0;
                acc = 1;
            }else {
                l3.val = tmpSum % 10;
                acc = tmpSum / 10;
            }

            result += Math.pow(10,i++)*l3.val;
            ref.next = l3;
            ref = l3;

            if (l1 != null){
                l1 = l1.next;
            }
            if (l2 != null){
                l2 = l2.next;
            }
        }
        if (acc == 1){
            ref.next = new ListNode(acc);
        }//再最后仍然需要对进位进行处理

        System.out.println(result);
        return head.next;

    }
}
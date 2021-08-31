package Utils;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public ListNode chainGenerator(int[] input){
        ListNode head = new ListNode();
        ListNode current = head;
        for (int i = 0; i < input.length; i++) {
            ListNode tmp = new ListNode();
            tmp.val =input[i];
            current.next = tmp;//将前序节点的后一个节点设置为新生成的node
            current = tmp; //赋值以后current后推
        }
        return head;
    }
}

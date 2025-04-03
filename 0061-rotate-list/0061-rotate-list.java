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
        int len = 1;
        if(head == null){
            return head;
        }
        ListNode curr = head;
        while(curr.next!=null){
            curr = curr.next;
            len++;
        }
        if(len == 1){
            return head;
        }
        curr.next = head;
        curr = head;
        k = k%len;
        k = len-k;
        while(k!=1){
            k--;
            curr = curr.next;
        }
        head = curr.next;
        curr.next = null;
        return head;
    }
}
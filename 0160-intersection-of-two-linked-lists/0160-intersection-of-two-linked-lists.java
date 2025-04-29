/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curr = headA;
        int len = 0;
        int len2 = 0;
        ListNode curr2 = headB;
        while(curr.next!=null){
            len++;
            curr= curr.next;
        }
        while(curr2.next!=null){
            len2++;
            curr2=curr2.next;
        }
        int diff = Math.abs(len-len2);
        if(len>len2){
            curr = headA;
            curr2 = headB;
        }
        else{
            curr = headB;
            curr2 = headA;
        }
        while(diff-->0){
            curr = curr.next;
        }
        while(curr!=curr2){
            curr = curr.next;
            curr2 =curr2.next;
        }
        return curr;

    }
}
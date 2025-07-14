/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        int count=0;
        while(fast!=null && fast.next!=null){
            count++;
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) break;
        }
        if(fast==null || fast.next==null) return null;
        while(head!=slow){
            head=head.next;
            slow=slow.next;
        }
        return head;
    }
}

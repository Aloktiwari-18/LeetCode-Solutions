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
    public ListNode reverse(ListNode head){
        ListNode prev= null;
        while(head!=null){
            ListNode next= head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow= head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        ListNode rev= reverse(slow);

        slow= head;
        while(rev!=null){
            if(rev.val!=slow.val){
                return false;
            }else{
                slow=slow.next;
                rev=rev.next;
            }
        }
        return true;
        
    }
}
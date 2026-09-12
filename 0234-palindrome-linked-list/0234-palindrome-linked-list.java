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
        ListNode prev=null;
        while(head!=null){
                ListNode next= head.next;
                head.next= prev;
                prev=head;
                head=next;
        }
        return prev;
        

    }
    public boolean isPalindrome(ListNode head) {
        ListNode first= head;
        ListNode slow= head;
        ListNode fast= head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast!=null){
                 slow=slow.next;
        }
       ListNode rev= reverse(slow);
        while(rev!=null){
            if(first.val!=rev.val){
                return false;
            }else{
                    rev=rev.next;
                    first=first.next;
            }
            
        }
        return true;
    }
}
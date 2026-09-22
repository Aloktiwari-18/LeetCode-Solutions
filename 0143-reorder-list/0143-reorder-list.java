
class Solution {
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        while(head!=null){
            ListNode next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
            ListNode slow= head;
            ListNode fast=head;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            ListNode sec=slow.next;
            slow.next=null;
            ListNode rev= reverse(sec);
            ListNode first=head;  
            
            while(rev!=null){
                 ListNode firstNext = first.next;
            ListNode secondNext = rev.next;

            first.next = rev;
            rev.next = firstNext;

            first = firstNext;
            rev = secondNext;
            }
           
        
    }
} 


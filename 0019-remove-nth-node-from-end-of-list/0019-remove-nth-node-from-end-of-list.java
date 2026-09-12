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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        ListNode dummy= temp;
        int count=0;
        while(dummy!=null){
            dummy=dummy.next;
            count++;
        }
        int k= count-n;
        if(k==0){
            return head.next;
        }
        dummy=head;
        int ret=0;
        while(dummy!=null && dummy.next!=null){
            if(ret==k-1){
                
                dummy.next=dummy.next.next;
                break;
            }else{
               
            ret++;
            dummy=dummy.next;
            }
            
            
        }
        return head;
        
    }
}
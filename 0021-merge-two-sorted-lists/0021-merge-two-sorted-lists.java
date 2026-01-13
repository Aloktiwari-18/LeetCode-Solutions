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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null) return list2;
        if(list2==null) return list1;
        ListNode dummy= new ListNode (-1);
        ListNode tail= dummy;
        ListNode first=list1;
        ListNode second= list2;
        while(first!=null  && second!=null){
            if(first.val<=second.val){
                tail.next=first;
                first=first.next;
            }else{
                tail.next=second;
                second=second.next;
            }
            tail=tail.next;
            if(first!=null) tail.next=first;
            if(second!=null) tail.next=second;
        

            
            


        }
        return dummy.next;
        
    }
}
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
      private ListNode mergeTwoLists(ListNode a, ListNode b) {
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        while (a != null && b != null) {
            if (a.val <= b.val) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }

        if (a != null) tail.next = a;
        if (b != null) tail.next = b;

        return dummy.next;
      }
      private ListNode merge(ListNode lists, int l , int r){
        if(l==r) return lists[l];

        int mid= (left+right)/2;
        ListNode left= merge(lists, l, mid);
        ListNode right= merge(lists, mid+1, r);

       return mergeTwoList(left,right);
        

      }

    public ListNode mergeKLists(ListNode[] lists) {
        
        if(lists==null || lists.length==0){
            return null;
        }
        return merge(lists,0, lists.length-1);
        
        
    }
}
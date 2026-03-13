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
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> st= new Stack<>();

        ListNode temp= head;
        while(temp!=null){
            if(st.size()==0) st.push(temp);
            else if(st.peek().val>temp.val){
                st.push(temp);

            }
            else {
                while(!st.isEmpty() && st.peek().val<temp.val){
                    st.pop();

            }
            st.push(temp);
            
        }
        temp= temp.next;

        }
        ListNode newHead= null;
        while(!st.isEmpty()){
            ListNode top= st.pop();
            top.next= newHead;
            newHead= top;
        }
        
        
    
    return newHead;

}

}
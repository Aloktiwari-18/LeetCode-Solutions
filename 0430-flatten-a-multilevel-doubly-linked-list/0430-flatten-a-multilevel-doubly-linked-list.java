/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {

        if(head == null) return null;

        Stack<Node> st = new Stack<>();

        Node dummy = new Node();
        Node ans = dummy;

        st.push(head);

        while(!st.isEmpty()) {
            Node curr = st.pop();
            ans.next = curr;
            curr.prev= ans;
            
            
            if(curr.next != null) {
                st.push(curr.next);
            }
            if(curr.child != null) {
                st.push(curr.child);
            }
            ans=curr; 
            curr.child=null; 

        }
        dummy.next.prev=null;
        return dummy.next;
    }
}
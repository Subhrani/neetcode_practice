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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> q=new PriorityQueue<>();
        for(ListNode n:lists){
            while(n!=null){
            q.add(n.val);
            n=n.next;
        }
        }
        ListNode result=new ListNode();
        ListNode ptr=result;
        while(!q.isEmpty()){
            ptr.next=new ListNode(q.remove());
            ptr=ptr.next;
        }
        return result.next;
    }
}

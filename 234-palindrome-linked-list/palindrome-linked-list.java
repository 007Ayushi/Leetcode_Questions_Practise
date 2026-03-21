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
    public boolean isPalindrome(ListNode head) {
        ListNode dummy=new ListNode(-1);
        ListNode temp1=dummy;

        ListNode temp=head;
        while(temp!=null){
            ListNode dummy2=new ListNode(temp.val);
            temp1.next=dummy2;
            temp=temp.next;
            temp1=temp1.next;
        }
        ListNode rev=reverse(dummy.next);
        ListNode t1=head;
        ListNode t2=rev;
        while(t1!=null && t2!=null){
            if(t1.val!=t2.val){
                return false;
            }
            t1=t1.next;
            t2=t2.next;
        }
        return true;
         
    }
    public ListNode reverse(ListNode head){
     ListNode curr=head;
     ListNode prev=null;
     ListNode Node=null;

     while(curr!=null){
        Node=curr.next;
        curr.next=prev;
        prev=curr;
        curr=Node;
     } 
     return prev;  

    }
}
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1=l1;
        ListNode temp2=l2;
        int i=0;
        while(temp1!=null)
        {
            i=(i*10)+temp1.val;
            temp1=temp1.next;
        }
        int ri=0;
        while(i!=0)
        {
            int rem=i%10;
            ri=(ri*10)+rem;
            i=i/10;
        }
        int j=0;
        while(temp2!=null)
        {
            j=(j*10)+temp2.val;
            temp2=temp2.next;
        }
        int rj=0;
        while(j!=0)
        {
            int mer=j%10;
            rj=(rj*10)+mer;
            j=j/10;
        }
        int sum=ri+rj;
        
        if(sum==0)
        {
            return new ListNode(0);
        }
        ListNode result=new ListNode(0);
        ListNode copy=result;
        while(sum!=0)
        {
            copy.next=new ListNode(sum%10);
            copy=copy.next;
            sum=sum/10;
        }
        return result.next;
    }
}

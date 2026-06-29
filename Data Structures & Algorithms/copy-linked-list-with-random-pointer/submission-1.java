/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null)
        return null;
        Node temp=head;//Step-1:
        while(temp!=null)
        {
            Node copy=new Node(temp.val);
            copy.next=temp.next;
            temp.next=copy;
            temp=copy.next;
        }
        temp=head;
        while(temp!=null)
        {
            if(temp.random!=null)
            {
                temp.next.random=temp.random.next;
            }
            temp=temp.next.next;
        }
        Node original=head;
        Node copyhead=head.next;//Step-3: Separating the original nodes from the duplicated nodes 
        Node copy=copyhead;
        while(original!=null)
        {
            original.next=original.next.next;
            if(copy.next!=null)
            {
                copy.next=copy.next.next;
            }
            original=original.next;
            copy=copy.next;
        }
        return copyhead;

    }
}

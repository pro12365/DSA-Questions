class ListNode {
    int val;
    ListNode next;
    ListNode random;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class Remove_nth_node_from_linkedlist {
    public int getcount(ListNode temp)
    {
        int count=0;
        while(temp!=null)
        {
            count++;
            temp= temp.next;
        }
        return count;
    }
    ListNode DeleteNode(ListNode head,int pos)
    {
       if(pos==0)
       {
        head= head.next;
        return head;
       }
       ListNode prev=head;
       for(int i=0;i<pos;i++)
       {
        prev=prev.next;
       }
       ListNode Prevnext=prev.next.next;

    return Prevnext;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        int length= getcount(head);
      ListNode newHead=DeleteNode(head, length-n);
        return newHead;
    }   
}

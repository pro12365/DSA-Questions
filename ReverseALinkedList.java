class ListNode
{
    int data;
    ListNode next;
    ListNode(int data, ListNode next)
    {
        this.data= data;
        this.next=next;
    }
}
public class ReverseALinkedList {
 public ListNode Reverse(ListNode head)
 {
     ListNode curr= head;
     ListNode prev= null;
     while(curr!= null)
     {
        ListNode temp= curr.next;
        curr.next=temp;  
     }
    return prev;
    
 }
    
}

/*The ListNode is a Class Structure for the Blueprint of a Linked list contains two properties 
 * data and next 
*/
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
public class RecursiveapproachReverseALinkedList {
    public ListNode reverseList(ListNode head)
    {
        //The recursive function stops when the head reaches null that means the list contains only 
        if(head==null||head.next==null)
        {
            return head;
        }
        ListNode newHead= reverseList(head.next);
        head.next.next=head;
        head.next=null;

        return newHead;
        
    }
}

import org.w3c.dom.Node;

class ListNode  
{
    String data;
    ListNode next;
    ListNode(String data, ListNode next)
    {
        this.data= data;
        this.next=next;
    }
}
public class PalindromeLinkedList {
boolean palindrome(ListNode head)
{
    if(head==null)
    {
        return true;
    }
    ListNode mid= findmiddle(head);
    ListNode last= reverse(mid.next);
    ListNode curr= head;
    while(last!=null)
    {
        if(last.data!=curr.data)
        {
            return false;
        }
        else
        {
            last= last.next;
            curr= curr.next;
        }
    }

    return true;
    
}

private ListNode reverse(ListNode head) {
    if(head==null||head.next==null)
    {
        return head;
    }
    ListNode newHead= reverse(head.next);
    head.next.next=head;
    head.next=null;

    return newHead;
    
   
}

private ListNode findmiddle(ListNode head) {
    ListNode slow= head;
    ListNode fast= head;
    while(fast.next!=null&&fast.next.next!=null)
     {
        slow= slow.next;
        fast= fast.next.next;
     }
    return slow;
}
public static void main(String[] args) {
    PalindromeLinkedList pl= new PalindromeLinkedList();
    ListNode head;
    
}
}

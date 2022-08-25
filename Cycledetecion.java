class ListNode{
    int val;
    ListNode next;

public ListNode(int val) {
    this.val = val;
    this.next = null;
}
}
public class Cycledetecion {
    ListNode detectcycle(ListNode head)
    {
        ListNode fast= head;
        ListNode slow= head;
        while(head!=null&&head.next!=null)
        {
            fast= head.next.next;
            slow= head.next.next;
            if(fast==slow)
            {
                return slow;
            }
        }
        return null;
        
    }
    ListNode finddetectionpoint(ListNode head)
    {
        ListNode meet= detectcycle(head);
        ListNode start= head;
        while(start!=meet)
        {
            start=start.next;
            meet= meet.next;
        }
        return start;
       
    }
}

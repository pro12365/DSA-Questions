import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

class ListNode
{
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Components {
    public int numComponents(ListNode head, int[] nums) {
       int c=0;
       ListNode curr= head;
       ListNode Next= null;
        HashSet set= new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        while(head!=null)
        {
            if (set.contains(head.val) && 
            (head.next == null || !set.contains(head.next.val))) {
            c++;
        }
          head= head.next;
          
        }
        
        return c;
     
    }
    public static void main(String[] args) {
        Components cmp= new Components();
        cmp.numComponents(head, nums)
        
    }
    
}

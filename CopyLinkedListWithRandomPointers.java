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
public class CopyLinkedListWithRandomPointers {
    public Node copyRandomList(Node head) {
        Node curr= head;
        while(head!=null)
        {
            Node temp= curr.next;
            curr.next= new Node(curr.val);
            curr.next.next= temp;
        }
        curr=head;
        while(head!=null)
        {
            if(curr.next!=null)
            {
               curr.next.random= (curr.random!=null)?curr.next.random:null;
            }
            curr= curr.next.next;
        }
        Node orig= head;
        Node copy= head.next;
        Node temp= copy;
        while(orig!=null)
        {
            orig.next= orig.next.next;
            copy.next= copy.next.next;
            orig= orig.next;
            copy= copy.next;
        }
        return temp;
        
    }
}

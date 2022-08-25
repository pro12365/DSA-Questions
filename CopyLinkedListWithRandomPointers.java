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
        //Linking the Liked Lists
        while(head!=null)
        {
            Node temp= curr.next;
            curr.next= new Node(curr.val);
            curr.next.next= temp;
        }
        //Setting the Random pointers
        curr=head;
        while(head!=null)
        {
            if(curr.next!=null)
            {
               curr.next.random= (curr.random!=null)?curr.next.random:null;
            }
            curr= curr.next.next;
        }
        //creating Original Node and Duplicate Nodes
        Node orig= head;
        Node copy= head.next;
        Node temp= copy;
        //Breaking the two lists into seperate Linked list
        while(orig!=null)
        {
            orig.next= orig.next.next;
            copy.next= copy.next.next;
            orig= orig.next;
            copy= copy.next;
        }
        return temp;
        
    }
    public static void main(String[] args) {
        Node start= null;
        start.val=5;
        Node pot=null;
        pot.val=11;
        start.next=pot;
        Node tot=null;
        tot.val=7;
        pot.next=tot;
        CopyLinkedListWithRandomPointers cp= new CopyLinkedListWithRandomPointers();
        Node res=cp.copyRandomList(start);
        System.out.println(res);
    }
}

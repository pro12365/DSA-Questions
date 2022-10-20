class ListNode
{
    int data;
    ListNode next;
    ListNode(int value)
    {
        this.data=value;
    }
}
public class DynamicStacks {
  ListNode head;
  int size;
  DynamicStacks()
  {
    head=null;
    size=0;
  }
  void push(int data)
  {
 
        ListNode temp= new ListNode(data);
        size++;
        temp.next=head;
        head=temp;
}
int pop()
{
    if(head==null)
    {
        try {
            throw new Exception("Stack UnderFlow");
        } catch (Exception e) {
        System.out.println("TO HANDLE EXCEPTION"+e+"PLEASE PUSH ITEMS INTO THE STACK");
            e.printStackTrace();
        }
    }
    else
    {
        int res= head.data;
        size--;
        head= head.next;
        return res;
    }
    return size;
}
int peek()
{
    if(head==null)
    {
        try {
            throw new Exception("Stack UnderFlow");
        } catch (Exception e) {
        System.out.println("TO HANDLE EXCEPTION"+e+"PLEASE PUSH ITEMS INTO THE STACK");
            e.printStackTrace();
        }
    }
    else{
        int res= head.data;
       head=head.next;
        return res;
    }
    return size;
}
boolean isEmpty()
{
    if(head==null)
    {
         return true;
    }
    else
    {
        return false;
    }
}

public static void main(String[] args) {
    DynamicStacks ds= new DynamicStacks();
    ds.push(5);
    ds.push(10);
    ds.push(15);
    System.out.println(ds.peek());
    ds.pop();
    System.out.println(ds.peek());
}
  }

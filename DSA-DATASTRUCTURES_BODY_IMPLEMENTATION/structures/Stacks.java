import java.util.Scanner;

public class Stacks {
   int arr[];
   int size;
   int top;
   Stacks(int length)
   {
    this.size=length;
     this.arr= new int[size];
    top=-1;
   }
   void push(int data)
   {
    if(top==size-1)
    {
        try {
            throw new Exception("Stack OveFlow");
        } catch (Exception e) {
            System.out.println("TO HANDLE EXCEPTION"+e+"Please Pop Items to make space");
            e.printStackTrace();
        }
    }
    else
    {    top++;
        arr[top]=data;
    }
   }
   int pop()
   {
    int res=0;
    if (top==-1)
    {
       try {
        throw new Exception("Stack Underflow");
    } catch (Exception e) {
       System.out.println("TO HANDLE EXCEPTION"+e+"PLEASE PUSH ITEMS INTO THE STACK");
        e.printStackTrace();
    }
    }
    else
    {
        res= arr[top];
        top--;
        return res;
    }
    return res;
   }
   int peek()
   {
    if(top==-1)
    {
        try {
            throw new Exception("Stack Under flow");
        } catch (Exception e) {
            System.out.println("TO HANDLE EXCEPTION"+e+"PLEASE PUSH ITEMS INTO THE STACK");
            e.printStackTrace();
        }
    }
    else
    {
        int res=arr[top];
        return res;
    }
    return size;
   }
    boolean isEmpty()
    {
        if(top==-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
   public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
    System.out.println("Enter Storage size");
    int n= scanner.nextInt();
    Stacks stacks= new Stacks(n);
    for(int i=0;i<n;i++)
    {
        System.out.println("enter element in stacks");
        int element= scanner.nextInt();
        stacks.push(element);
    }
    System.out.println(stacks.peek());
    System.out.println(stacks.isEmpty());
    stacks.pop();
   }
}

import java.util.Stack;

public class Parenthesiesmatching {
    boolean matchparenthesies(char arr[])
    {
        Stack<Character> stack= new Stack<>();
        for(int i=0; i< arr.length;i++)
        {
           if(isopening(arr[i]))
           {
             stack.push(arr[i]);
           }
           else
           {
             if(stack.isEmpty())
             {
               return false;
             }
            else if(ismatching(arr[i], stack.peek())==false)
             {
                  return false;
             }
             else
             {
                stack.pop();
             }
           }
        }
        return stack.isEmpty();
    }
boolean isopening(char a)
{
    return a=='('||a=='{'||a=='(';
    
}
boolean ismatching(char a, char b)
{
    return(a=='(' &&  b== ')')|| (a=='{'&& b=='}')||(a=='['&& b==']');
    
}
 
    public static void main(String[] args) {
      char arr[]={'{','(','[',']',')','}'};
      Parenthesiesmatching pt= new Parenthesiesmatching();
      boolean checks= pt.matchparenthesies(arr);
      if(checks==true)
      {
         System.out.println("My Code Works");
      }
      else{
        System.out.println("It not Works");
      }
        
    }
}


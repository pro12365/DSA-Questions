import java.util.Stack;

public class MAxareaofHistogram {
    int find_max_area(int arr[])
    {
        int max_ans=0;
        int prev[]= previous_Smaller_element(arr);
        int next[]= next smaller_element(arr);
        for(int i=0;i<arr.length;i++)
        {
            int curr_area= (next[i]-prev[i])*arr[i];
            max_ans= Math.max(max_ans, curr_area);
        }
    }
     int[] previous_Smaller_element(int[] arr) {
        int prev_small[]= new int[arr.length];
        Stack<Integer>stack= new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            while(stack.isEmpty()==true&&arr[stack.peek()]>=arr[i])
            {
                stack.pop();
            }
            if(stack.isEmpty())
            {
                prev_small[i]=-1;
            }
            else
            {
                prev_small[i]=stack.peek();
            }
            stack.push(i);
        }
        return prev_small;
    }
     int[] smaller_element(int[] arr) {
        int next_small[]= new int[arr.length];
        Stack<Integer>stack= new Stack<>();
        for(int i=arr.length;i>0;i++)
        {
            while(stack.isEmpty()==true&&arr[stack.peek()]<=arr[i])
            {
                stack.pop();
            }
            if(stack.isEmpty())
            {
                next_small[i]=-1;
            }
            else
            {
                next_small[i]=stack.peek();
            }
            stack.push(i);
        }
        return next_small;
    }
    public static void main(String[] args) {
        
    }
    }
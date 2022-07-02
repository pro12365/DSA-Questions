import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BookAllocation {
    static int sumarray(Integer arr[])
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        return sum;
    }
    static boolean isfeasible(Integer arr[],int key,int res)
    {
        int student=1,sum=0;
        for(int i=0;i<arr.length;i++)
        {
            if(sum+arr[i]>res)
            {
                student++;
                sum= arr[i];
            }
            else
            {
                sum+=arr[i];
            }
        }
        return student<=key;
    }
    static int allocatebook(Integer array[],int key)
    {

        int min= Collections.max(Arrays.asList(array));
        int max= sumarray(array);
        int res=0;
        while(min<=max)
        {
            int mid= (min+max)/2;
          if(isfeasible(array,key,mid)==true)
          {
              res=mid;
              max=mid-1;
          }
          else
          {
              min= min+1;
          }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter number of Books");
        int n= scanner.nextInt();
        System.out.println("Enter Key");
        int prom= scanner.nextInt();
        Integer books[]= new Integer[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter number of pages in the book");
            books[i]= scanner.nextInt();
        }
        System.out.println("Minimum number of pages read by a Student is");
        int pages=allocatebook(books,prom);
        System.out.println(pages);
    }
    
}

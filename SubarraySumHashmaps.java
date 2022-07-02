import java.util.HashMap;
import java.util.Scanner;

public class SubarraySumHashmaps {
    void sumsub(Integer arr[],Integer sum)
    {
        int curr = 0;
        int start = 0;
        int end=-1;
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            curr= curr+arr[i];
            if(curr-sum==0)
            {
                start=0;end=i;
                break;
            }
            if(mp.containsKey(curr-sum))
            {
                start=mp.get(curr-sum)+1;
                end=i;
                break;
            }
            mp.put(curr,i);
        }
        if(end==-1)
        {
            System.out.println("Sub Array Not Found ");
        }
        else{
            System.out.println("Sub Array Found");
            System.out.println(start);
            System.out.println(end);
        }

    }
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The length of the Array");
        int n= scanner.nextInt();
        System.out.println("Enter Sum");
        int sum=scanner.nextInt();
      Integer arr[]= new Integer[n];
      for (int i=0; i<n;i++)
      {
          System.out.println("Inserting Array Element");
          arr[i]= scanner.nextInt();
          System.out.println("Array Element Inserted"+"\n"+arr[i]);
          System.out.println("Index"+"\n"+i);

      }
      SubarraySumHashmaps sb= new SubarraySumHashmaps();
      sb.sumsub(arr,sum);
    }
}

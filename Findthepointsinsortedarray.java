import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Findthepointsinsortedarray {
    public int searchfirst(int nums[],int target)
    {
        int low=0;
        int first=-1;
        int high= (nums.length)-1;
        while(low<=high)
        {
            int mid= low + ((high - low)/2);
            if(nums[mid]==target)
            {
              first= mid;
              high= mid-1;
            }
            else if(target<nums[mid])
            {
                high= mid-1;
            }
            else
            {
                low= mid+1;
            }
        }
        return first;
    }
    public int searchlast(int nums[],int target)
    {
        int low=0;
        int last=-1;
        int high= (nums.length)-1;
        while(low<=high)
        {
            int mid= low + ((high - low)/2);
            if(nums[mid]==target)
            {
              last= mid;
              low= low+1;
            }
            else if(target<nums[mid])
            {
                high= mid-1;
            }
           else
            {
                low= mid+1;
            }
        }
        return last;
    }
    public int[] searchrange(int nums[],int target)
    {
      int arr[]= new int[2];
      arr[0]= searchfirst(nums, target);
      arr[1]= searchlast(nums, target);
    return arr;      
    }
    public static void main(String[] args) {
        Findthepointsinsortedarray fp= new Findthepointsinsortedarray();
        Scanner scanner= new Scanner(System.in);
        int nums[]={1,2,3,4,5,5,8,8,8,9};
        int target=8;
        int array[]= fp.searchrange(nums, target);
        System.out.println(array.toString());
    }
}

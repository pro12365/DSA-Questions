import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class RoastedSortedArrayII {
    boolean presentelement(int[] arr,int target)
    {
        ArrayList list= new ArrayList<Integer>();
        Collections.addAll(list, arr);
        if(list.contains(target)==true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean search(int[] nums, int target) {
        int low=0;
        int high= nums.length-1;
        while(low <= high && nums[low] == nums[high]) {
            if(nums[low] == target) {
                return true;
            }
            low++;
            high--;
        }
        while(low<=high)
        {
            int mid= low+((high-low)/2);
            if(target==nums[mid])
            {
                return true;
            }
            if(nums[low]<nums[mid])
            {
                if(target>nums[low]&&target<nums[mid])
                {
                    high= mid-1;
                }
                else
                {
                    low= mid+1;
                }
                if(target>nums[mid]&& target<nums[high])
                {
                    low= mid+1;
                }
                else
                {
                    high= mid-1;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        RoastedSortedArrayII rs= new RoastedSortedArrayII();
        int arr[]={2,5,6,0,0,1,2};
        int key=2;
       boolean res=rs.search(arr, key);
       System.out.println(res);
    }
}

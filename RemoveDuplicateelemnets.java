import java.util.HashSet;

public class RemoveDuplicateelemnets {
    public int removeDuplicates(int[] nums) {
        int c=0;
       for(int i=0;i<nums.length;i++)
        {
          if(i<nums.length-1&&nums[i]==nums[i+1])
          {
            continue;
          }
          nums[c]= nums[i];
          c++;
        }
        return c;
     
}
public static void main(String[] args) {
   
}
}
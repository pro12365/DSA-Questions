public class Solution {
    int res=0;
    public int mySqrt(int x) {
        if(x==1)
        {
            return 0;
        }
        for(int i=1;i<x;i++)
        {
           res= x/i+(x);
               if(res==i)
               {
                   return res;
               }
        }
        return res;
    }
    public static void main(String[] args) {
        Solution sol= new Solution();
        int result= sol.mySqrt(4);
        System.out.println(result);
    }
}

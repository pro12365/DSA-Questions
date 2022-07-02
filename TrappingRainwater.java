public class TrappingRainwater {
    //Checking The blocks of water that can be fitted in each index
    int checkblocks (int a[])
    {
        //a left array to check the maximum height of the blocks present in the left side
        int left[] = new int[a.length];
        // a right array to check the maximum height of the blocks present in the right side
        int right[] = new int[a.length];
        //Initializes left array 
        left[0]= a[0];
        //filling the left array 
        for (int i = 1; i < a.length; i++)
        {
            //Storing the Maximum Height in the left part of the array
            left[i] = Math.max(left[i - 1], a[i]);
        }
        //Initializing the right array
        right[a.length-1]=a[a.length-1];
        for(int i=(a.length-2);i>=0;i--)
        {
            //storing the maximum height at right side
            right[i]= Math.max(right[i+1],a[i]);
        }
        int maxrain=0;
        for(int i=0;i<a.length;i++)
        {
            //Finding out Maximum rain using generalised Formulae maxrain= min(left,right)-height
            maxrain=maxrain+(Math.min(left[i],right[i])-a[i]);
        }
        return maxrain;
    }
    public static void main(String[] args) {
        int arr[]={0,1,0,2,1,0,1,3,2,1,2,1};
        TrappingRainwater tt= new TrappingRainwater();
        int ans=tt.checkblocks(arr);
        System.out.println(ans);
    }
}
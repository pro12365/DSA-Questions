public class TrappingRainwater {
    int checkblocks (int a[])
    {
        int left[] = new int[a.length];
        int right[] = new int[a.length];
        left[0]= a[0];
        for (int i = 1; i < a.length; i++)
        {
            left[i] = Math.max(left[i - 1], a[i]);
        }
        right[a.length-1]=a[a.length-1];
        for(int i=(a.length-2);i>=0;i--)
        {
            right[i]= Math.max(right[i+1],a[i]);
        }
        int maxrain=0;
        for(int i=0;i<a.length;i++)
        {
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
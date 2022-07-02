
public class Stocksbuyandsellproblems {
    int maxRevenue=0;

    int stockassistant(int arr[],int size)
    {
for(int i=1;i<size;i++)
{
if(arr[i]>arr[i-1])
{
    maxRevenue+= arr[i]-arr[i-1];
}
}
        return maxRevenue;
    }
    public static void main(String[] args) {
        int a[]={5,3,1,16,52,9,6};
        int length=a.length;
Stocksbuyandsellproblems sb = new Stocksbuyandsellproblems();
int ans= sb.stockassistant(a,length);
        System.out.println("Your Revenue\t"+ans);
    }
}

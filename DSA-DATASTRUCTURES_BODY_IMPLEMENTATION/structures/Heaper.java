package structures;
public class Heaper {
    void Insert(int arr[],int value,int n)
    {
       n= n+1;
       arr[n]=value;
       int i= n;
       while (i>1) {
        int parent= i/2;
        if(arr[parent]<arr[i])
        {
            swap(arr,parent,i);
            i= parent;
        }
        else
        {
            return ;
        }
       }
    }
    private void swap(int[] arr, int parent, int i) {
        int temp;
        temp=arr[parent];
        arr[parent]=arr[i];
        arr[i]= temp;
    }
    void delete(int arr[],int n)
    {
        arr[1]= arr[n];
        n=n-1;
        int i=1;
        while(i>1)
        {
            int left= arr[i*2];
            int right= arr[(i*2)+1];
            int larger= left>right?2*i:(2*i)+1;
            if(arr[i]<larger)
            {
                swap(arr, larger, i);
                i=larger;
            }
            else
            {
                return;
            }
         
        }



    }
    public static void main(String[] args) {
        
    }
}

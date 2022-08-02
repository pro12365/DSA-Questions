import java.security.Key;

public class RotatedSortedArray {
    // A binary Search Function To Search the number in the array
    int bsearch(int array[],int key)
    {
        int start = 0;//Starting point
        int end = array.length - 1;//ending 
        //iniitiating the binary search
        while(start <= end) {
            int mid = (start + end)/2;

            if(key == array[mid]) {
                return mid;
            }

            if(array[start] <= array[mid]) { // checking if the left array is sorted or not
                if(key >= array[start] && key < array[mid]) { // checking it if the key lies in the left array or nt
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            } else { // right array is sorted
                if(key > array[mid] && key <= array[end]) { // target lies between mid and end index
                    start = mid+1;
                } else {
                    end = mid-1;
                }
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
       int  key=0;
        RotatedSortedArray rs= new RotatedSortedArray();
        int result=rs.bsearch(arr, key);
        System.out.println(result);
        
    }
    
}

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int[] nums_copy = Arrays.copyOf(nums, nums.length);
        Arrays.sort(nums_copy);
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int sum = nums_copy[l] + nums_copy[r];
            if (sum == target) {
                result[0] = l;
                result[1] = r;
                break;
            } else if (sum>target) {
                r--;
            } else {
                l++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter target");
       int target = scanner.nextInt();
        System.out.println("Enter number of elements");
       int length= scanner.nextInt();
       int[] num = new int[length];
       for (int i = 0; i <length ; i++) {
           System.out.println("Enter element");
            num[i] = scanner.nextInt();
       }
        int[] result = twoSum.twoSum(num, target);
        System.out.println(Arrays.toString(result));
    }
}

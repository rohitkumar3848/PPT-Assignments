import java.util.*;
class arrayPartition {
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length;i=i+2){
            sum+=nums[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int ar1[] = { 1,4,3,2};
        System.out.println(arrayPairSum(ar1));
    }
}
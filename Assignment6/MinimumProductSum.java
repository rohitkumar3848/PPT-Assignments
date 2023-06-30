import java.util.Arrays;

public class MinimumProductSum {
    public static int minProductSum(int nums1[],int nums2[]){
        int sum=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        for(int i=0;i<nums1.length;i++){
            sum+=nums1[i]*nums2[nums2.length-i-1];
        }
        return sum;
    }
    public static void main(String[] args) {
        int nums1[] = {5,3,4,2};
        int nums2[] = {4,2,2,5};
        System.out.println(minProductSum(nums1, nums2));
    }
}

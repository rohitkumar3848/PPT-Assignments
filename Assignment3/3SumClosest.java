import java.util.*;
class 3SumClosest {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;
        int res=0;
        int diff=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int l=i+1;
            int h=n-1;
            while(l<h){
                int sum=nums[i]+nums[l]+nums[h];
                if(Math.abs(sum-target)<diff){
                    res=sum;
                    diff=Math.abs(sum-target);
                }
                if(sum==target){
                    return target;
                }
                else if(sum<target){
                    l++;
                }
                else{
                    h--;
                }

            }
        }
        return res;
    }
    public static void main(String[] args) {
        int nums[] = {-1,2,1,-4};
        int target = 1;
        System.out.println(threeSumClosest(nums,target));
    }
}
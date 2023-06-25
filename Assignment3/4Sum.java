
import java.util.*;
public class 4Sum {
    public static List<List<Integer>> fourSum(int[] nums,int target) {
        List<List<Integer>> a1=new LinkedList<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n-3;i++){
            if(i==0 || (i>0 && nums[i]!=nums[i-1])){
                for(int j=i+1;j<n-2;j++){
                    if(j==i+1 || (j>0 && nums[j]!=nums[j-1])){
                     int low=j+1;
                    int high=n-1;
                while(low<high){
                long  sum=nums[i]+nums[j];
                sum+=nums[low];
                sum+=nums[high];
                if(sum==target){
                    a1.add(Arrays.asList(nums[i],nums[j],nums[low],nums[high]));
                    while(low<high && nums[low]==nums[low+1]){
                        low++;
                    }
                    while(low<high && nums[high]==nums[high-1]){
                        high--;
                    }
                    low++;
                    high--;
                }
                else if(sum<target){
                    low++;
                }
                else{
                    high--;
                }
                }
                    }
                }
            }
        }
        return a1;
    }
    public static void main(String[] args) {
        int nums[] = {1,0,-1,0,-2,2};
        int target=0;
        System.out.println(fourSum(nums,target));
    }
}
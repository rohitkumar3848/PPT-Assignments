import java.util.*;
public class MissingRanges {
        public static List<String> findMissingRanges(int[] nums, int lower, int upper) {
            int n=nums.length;
            List<String> res= new LinkedList<>();
            if(n==0){
                res.add(lower+ "->" + upper);
                return res;
            }
            if(nums[0]>lower){
                String next=Integer.toString(nums[0]-1);
                res.add(lower+ "->" + next);
            }
            for(int i=1;i<n;i++){
                int a=nums[i-1];
                String next1=Integer.toString(nums[i-1]+1);
                int b=nums[i];
                String next2=Integer.toString(nums[i]-1);
                if(nums[i-1]<nums[i]-1){
                    res.add(next1+"->"+next2);
                }
            }
            if(nums[n-1]<upper-1){
                String pre=Integer.toString(nums[n-1]+1);
                res.add(pre+ "->" + upper);
            }
            return res;
        }
    public static void main(String[] args) {
        int nums[] = {0,1,3,50,75};
        int lower = 0;
        int upper = 99;
        System.out.println(findMissingRanges(nums,lower,upper));

    }
}

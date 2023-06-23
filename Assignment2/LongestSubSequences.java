import java.util.*;
class LongestSubSequences {
    public static int findLHS(int[] nums) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]+1)){
                res = Math.max(res, map.get(nums[i]) + map.get(nums[i] + 1));
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int nums[] = {1,3,2,2,5,2,3,7};
        System.out.println(findLHS(nums));
    }
}
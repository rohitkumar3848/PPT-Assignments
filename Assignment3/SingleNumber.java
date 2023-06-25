public class SingleNumber {
    
}
class Solution {
    public static int singleNumber(int[] nums) {
        int res=0;
        for(int ele:nums){
            res=res^ele;
        }
        return res;
    }
    public static void main(String[] args) {
        int nums[] = {2,2,1};
        System.out.println(singleNumber(nums));
    }
}

class Smallestrange {
    public static int smallestRangeI(int[] nums, int k) {
        int max=nums[0];
        int min=nums[0];
        for(int i=1;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);
        }
        //Minimum diff when we get by adding k in min add by subtracting k in max
        //Ex-max=20 min=5 k=3 20-3-(5+3)
        int diff=(max-k)-(min+k);
        diff=(diff>0)?diff:0;
        return diff;
    }
    public static void main(String[] args) {
        int nums[] = {1,3,6};
        int k = 3;
        System.out.println(smallestRangeI(nums,k));
    }
}
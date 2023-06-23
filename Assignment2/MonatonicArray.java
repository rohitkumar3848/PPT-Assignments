
class MonatonicArray {
    public static boolean isMonotonic(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                for(int j=i+1;j<nums.length-1;j++){
                    if(nums[j]>nums[j+1]){
                        return false;
                    }
                }
                return true;
            }
            else if(nums[i]>nums[i+1]){
                for(int j=i+1;j<nums.length-1;j++){
                    if(nums[j]<nums[j+1]){
                        return false;
                    }
                }
                return true;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,2,1};
        boolean ans=isMonotonic(nums);
        System.out.println(ans);
    }
}
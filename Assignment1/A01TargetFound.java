public class A01TargetFound{
    public static int[] target(int []nums,int target){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{nums[i],nums[j]};
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int []nums = {2,7,11,15};
        int target = 71;
        int sum[]=target(nums,target);
        System.out.println(sum[0]+" "+sum[1]);
    }
}

class NextPermutation {
    public static int[] nextPermutation(int[] nums) {
         int idx1=-1;
         int n=nums.length;
         for(int i=n-1;i>0;i--){
             if(nums[i]>nums[i-1]){
                 idx1=i;
                 break;
             }
         }
         if(idx1==-1){
             reverse(nums,0);
         }
         else{
             int prev=idx1;
             for(int i=idx1+1;i<n;i++){
                 if(nums[i]>nums[idx1-1] && nums[i]<=nums[prev]){
                     prev=i;
                 }
             }
             swap(nums,idx1-1,prev);
             reverse(nums,idx1);
         }
         return nums;
    }
    public static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static void reverse(int[] nums,int start){
        int i=start;
        int j=nums.length-1;
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3};
        int ans[]=nextPermutation(nums);
        for(int ele:nums){
            System.out.print(ele+" ");
        }
    }
}
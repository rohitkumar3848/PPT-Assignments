public class A08MoveZeroAtEnd {
    public static void swap(int []nums,int i,int count){
        int temp=nums[i];
        nums[i]=nums[count];
        nums[count]=temp;
    }
    public static void moveZeroEnd(int []nums){
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                swap(nums,i,count);
                count++;
            }
        }
    }
    public static void main(String[] args) {
        int nums[]={0,1,0,3,12};
        moveZeroEnd(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}

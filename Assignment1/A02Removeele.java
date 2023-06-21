public class A02Removeele {
    public static int removeEle(int []nums,int val){
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                nums[count++]=nums[i];
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int []nums = {3,2,2,3};
        int  val = 3;
        int res=removeEle(nums,val);
        System.out.println(res);
    }
}

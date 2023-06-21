import javax.sound.sampled.ReverbType;

public class A03TargetIndex {
    public static int targetIndex(int [] nums,int target){
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int []nums ={ 1,3,5,6};
        int target = 5;
        int idx=targetIndex(nums,target);
        System.out.println(idx);
    }
}

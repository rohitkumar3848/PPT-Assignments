import java.util.HashMap;
import java.util.HashSet;

public class A09MissingDuplicateEle {
    public static int[] missingDuplicateEle(int []nums){
        int miss=-1;
        int rep=-1;
        int temp[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            temp[nums[i]-1]++;
            if(temp[nums[i]-1]>1){
                rep=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(temp[i]!=i+1){//Or-->if(temp[i]>0)
                miss=i+1;
                break;
            }
        }
        return new int[]{rep,miss};
    }
    public static void main(String[] args) {
        int nums[]={1,2,2,4};
        int []res=missingDuplicateEle(nums);
        System.out.println(res[0]+" "+res[1]);
    }   
}

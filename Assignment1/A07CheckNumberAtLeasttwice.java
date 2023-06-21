import java.util.*;
public class A07CheckNumberAtLeasttwice{
    public static boolean check(int []nums,int n){
        Arrays.sort(nums);
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[]= {1,2,3,4};    
        int n=nums.length;
        if(check(nums, n)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
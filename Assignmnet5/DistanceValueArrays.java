import java.util.*;
class DistanceValueArrays {
    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int m=arr1.length;
        int n=arr2.length;
        Arrays.sort(arr2);
        int count=0;
        for(int i=0;i<m;i++){
            int low=0;
            int high=n-1;
            while(low<=high){
                int mid=low+(high-low)/2;
                if(Math.abs(arr1[i]-arr2[mid])<=d){
                    count++;
                    break;
                }
                if(arr1[i]>arr2[mid]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return m-count;
    }
    public static void main(String[] args) {
        int arr1[] = {4,5,8};
        int arr2[] = {10,9,1,8};
        int d = 2;
        System.out.println(findTheDistanceValue(arr1, arr2, d));
    }
}
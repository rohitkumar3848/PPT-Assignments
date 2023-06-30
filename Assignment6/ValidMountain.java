
class ValidMountain {
    public  static boolean validMountainArray(int[] arr) {
        int n=arr.length;
        if(n<3){
            return false;
        } 
        int i=0;
        while(i<n-1 && arr[i]<arr[i+1]){
            i++;
        } 
        if(i==0 || i==n-1){
            return false;
        }
        while(i<n-1 && arr[i]>arr[i+1]){
            i++;
        } 
        if(i==n-1){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,2,1};
        System.out.println(validMountainArray(arr));
    }
}

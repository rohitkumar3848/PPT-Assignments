
class arrangingCoins {
    public static int arrangeCoins(int n) {
        long low=0;
        long high=n;
        while(low<=high){
            long mid=low+(high-low)/2;
            if(mid*(mid+1)/2<=n){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return (int)low-1;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(arrangeCoins(n));
    }
}

class arrangingCoins {
    public static int arrangeCoins(int n) {
        int i=1;
        if(n==1){
            return 1;
        }
        for(i=1;i<=n;i++){
            n=n-i;
            if(n==0){
                return i;
            }
            if(n<0){
                return i-1;
            }
        }
        return i-1;
    }
    public static void main(String[] args) {
        int n=6;
        System.out.println(arrangeCoins(n));
    }
}
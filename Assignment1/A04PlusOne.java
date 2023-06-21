class A04PlusOne {
    public static int[] plusOne(int[] digits) {
        int n=digits.length;
        for(int i=n-1;i>=0;i--){
            if(digits[i]!=9){
                digits[i]+=1;
                break;
            }
            else{
                digits[i]=0;
            }
        }
        if(digits[0]==0){
            int res[]=new int[n+1];
            res[0]=1;
            return res;
        }
        return digits;
    }
    public static void main(String[] args) {
        int arr[]={9,9,9,9};
        int digits[]=plusOne(arr);
        for(int i=0;i<digits.length;i++){
            System.out.print(digits[i]+" ");
        }
    }
}

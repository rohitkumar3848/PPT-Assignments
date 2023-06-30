
class OriginalFromDoubled {
    public static int[] findOriginalArray(int[] changed) {
        if(changed.length%2!=0){
            return new int[0];
        }
        int res[]=new int[100001];
        int k=0;
        for(int i=0;i<changed.length;i++){
            for(int j=i+1;j<changed.length;j++){
                if((changed[i]*2)==changed[j]){
                    res[k++]=changed[i];
                }
            }
        }
        int count=0;
        for(int ele:res){
            if(ele!=0){
                count++;
            }
            else{
                break;
            }
        }
        int ans[]=new int[count];
        int l=0;
        for(int ele:res){
            if(ele==0){
                break;
            }
            ans[l++]=ele;
        }
        return ans;
    }
    public static void main(String[] args) {
        int changed[] = {1,3,4,2,6,8};
        int res[]=findOriginalArray(changed);
        for(int ele:res){
            System.out.println(ele+" ");
        }
    }
}
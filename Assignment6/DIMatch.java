class DIMatch {
    public static int[] diStringMatch(String s) {
        int res[]=new int [s.length()+1];
        int l=0;
        int r=res.length-1;
        int i=0;
       for(int j=0;j<s.length();j++){
            if(s.charAt(j)=='I'){
                res[i]=l;
                l++;
                i++;
            }
            else{
                res[i]=r;
                r--;
                i++;
            }
        }
        if(s.charAt(s.length()-1)=='I'){
            res[i]=l;
        }
        else{
            res[i]=r;
        }
        return res;
    }
    public static void main(String[] args) {
        String s="IDID";
        int res[]=diStringMatch(s);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
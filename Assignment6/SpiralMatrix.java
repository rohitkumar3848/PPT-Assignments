
class SpiralMatrix {
    public static int[][] generateMatrix(int n) {
        int r1=0;
        int r2=n-1;
        int c1=0;
        int c2=n-1;
        int val=1;
        int res[][]=new int[n][n];
        while(r1<=r2 && c1<=c2){
            for(int c=c1;c<=c2;c++){
                res[r1][c]=val++;
            }
            for(int c=r1+1;c<=r2;c++){
                res[c][c2]=val++;
            }
            if(r1<=r2 && c1<=c2){
                for(int c=c2-1;c>c1;c--){
                res[r2][c]=val++;
                }
                for(int c=r2;c>r1;c--){
                    res[c][c1]=val++;
                }
            }
            r1++;
            r2--;
            c1++;
            c2--;
        }
        return res;
    }
    public static void main(String[] args) {
        int n=3;
        int res[][]=generateMatrix(n);
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[0].length;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
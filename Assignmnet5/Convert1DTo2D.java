import java.util.ArrayList;

class Convert1DTo2D{
    public static int[][] construct2DArray(int[] original, int m, int n) {
        if(m*n!=original.length){
            return new int[0][0];
        }
        int res[][]=new int[m][n];
        int k=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                res[i][j]=original[k++];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int num[]={1,2,3,4};
        int m=2;
        int n=2;
        int res[][]=construct2DArray(num, m, n);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
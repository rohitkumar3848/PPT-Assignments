
class transpose {
    public static int[][] transpose(int[][] matrix) {
        int m=matrix[0].length;
        int n=matrix.length;
        int res[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                res[i][j]=matrix[j][i];
            }
        }
        return res;
    }
    public static void main(String[] args) {
       int  matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
       int res[][]=transpose(matrix);
       for(int i=0;i<res.length;i++){
        for(int j=0;j<res.length;j++){
            System.out.print(res[i][j]+" ");
        }
        System.out.println();
       }
    }
}
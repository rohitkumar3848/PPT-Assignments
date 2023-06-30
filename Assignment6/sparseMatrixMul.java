public class sparseMatrixMul {
    public static int[][] mul(int num1[][],int num2[][]){
        int temp=0;
        int res[][]=new int[num1.length][num2[0].length];
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[0].length;j++){
                temp=0;
                for(int k=0;k<num1[0].length;k++){
                    temp+=num1[i][k]*num2[k][j];
                }
                res[i][j]=temp;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int mat1[][] = {{1,0,0},{-1,0,3}};
        int mat2[][] = {{7,0,0},{0,0,0},{0,0,1}};
        int res[][]=mul(mat1, mat2);
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[0].length;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}

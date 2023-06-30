class Search2DMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int mididx;
        int row;
        int col;
        int midele;
        int n=matrix[0].length;
        int low=0;
        int high=m*n-1;
        while(low<=high){
            mididx=low+(high-low)/2;
            row=mididx/n;
            col=mididx%n;
            midele=matrix[row][col];
            if(midele==target){
                return true;
            }
            else {
                    if(target<midele){
                    high=mididx-1;
                }
                else{
                    low=mididx+1;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
       int matrix[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
       int target = 3;
       System.out.println(searchMatrix(matrix,target));
    }
}
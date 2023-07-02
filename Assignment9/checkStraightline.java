
class checkStraightline{    
    public static boolean checkStraightLine(int[][] coordinates) {
        int n = coordinates.length;

        int x1 = coordinates[0][0];
        int y1 = coordinates[0][1];

        int x2 = coordinates[1][0];
        int y2 = coordinates[1][1];
        
        int dx=x2-x1;
        int dy=y2-y1;
        for (int i = 2; i < n; i++) {
            int x4 = coordinates[i][0];
            int y4 = coordinates[i][1];

            int x3 = coordinates[i-1][0];
            int y3 = coordinates[i-1][1];
            
            if((y4-y3)*dx!=(x4-x3)*dy)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int coordinates[][] = {{1,1},{2,2},{3,4},{4,5},{5,6},{7,7}};
        System.out.println(checkStraightLine(coordinates));
    }
}
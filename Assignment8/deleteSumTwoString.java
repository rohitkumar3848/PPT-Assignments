import java.util.*;
class deleteSumTwoString{
    public static int minimumDeleteSum(String s1, String s2){
        int[][] dp = new int[1001][1001];
        for(int[] d:dp){
            Arrays.fill(d,-1);
        }
        return sum(0,0,s1,s2,dp);
    }
    
    public static int sum(int i,int j,String s1,String s2,int dp[][]){
        if(i == s1.length() && j == s2.length()){
            return 0;
        }
        else if(i<s1.length() && j == s2.length()){
            int curr = 0;
            for(int idx = i;idx<s1.length();idx++){
                curr += s1.charAt(idx);
            }
            return curr;
        }
        else if(j<s2.length() && i == s1.length()){
            int curr = 0;
            for(int idx = j;idx<s2.length();idx++){
                curr += s2.charAt(idx);
            }
            return curr;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        if(s1.charAt(i) == s2.charAt(j)){
            return dp[i][j]=sum(i+1,j+1,s1,s2,dp);
        }
        else{
            int first = (int)(s1.charAt(i)) + sum(i+1,j,s1,s2,dp);
            int second = (int)(s2.charAt(j)) + sum(i,j+1,s1,s2,dp);
            
            return dp[i][j]=Math.min(first,second);
        }
    }
    public static void main(String[] args) {
         String s1 = "sea";
         String s2 = "eat";
         System.out.println(minimumDeleteSum(s1,s2));
    }
}
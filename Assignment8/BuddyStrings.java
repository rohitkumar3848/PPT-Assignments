import java.util.*;
class BuddyStrings {
    public static boolean buddyStrings(String s, String goal) {
        int n1=s.length();
        int n2=goal.length();
        if(n1!=n2){
            return false;
        }
        if(s.equals(goal)){
            int res[]=new int[26];
            for(char e:s.toCharArray()){
                res[e-'a']++;
                if(res[e-'a']==2){
                    return true;
                }
            }
            return false;
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<n1;i++){
            if(s.charAt(i)!=goal.charAt(i)){
                ans.add(i);
                if(ans.size()>2){
                    return false;
                }
            }
        }
        if(ans.size() == 2){
            if(s.charAt(ans.get(0)) == goal.charAt(ans.get(1)) && s.charAt(ans.get(1)) == goal.charAt(ans.get(0))){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "ab";
        String  goal = "ba";
        System.out.println(buddyStrings(s,goal));
    }
}
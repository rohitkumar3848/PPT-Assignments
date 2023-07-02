import java.util.*;
class Solution {
    public static boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        if(s.equals(t)){
            return true;
        }
        char c = 'a';
        HashMap<Character, Character> h1 = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(h1.containsKey(s.charAt(i))){
                c=h1.get(s.charAt(i));
                if(c!=t.charAt(i)){
                    return false;
                }
            }
            else if(!h1.containsValue(t.charAt(i))){
                h1.put(s.charAt(i),t.charAt(i));
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String a="aab";
        String b="xxy";
        System.out.println(isIsomorphic(a,b));
    }
}
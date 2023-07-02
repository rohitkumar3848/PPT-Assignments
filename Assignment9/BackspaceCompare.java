import java.util.*;
class BackspaceCompare {
    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> s1= new Stack<>();
        Stack<Character> s2= new Stack<>();
        for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        if(!s1.empty() && c=='#'){
            s1.pop();
        }
        else{
            if(c!='#'){
                s1.push(c);
            }
        }
        }

        for(int i=0;i<t.length();i++){
        char c=t.charAt(i);
        if(!s2.empty() && c=='#'){
            s2.pop();
        }
        else{
            if(c!='#'){
                s2.push(c);
            }
        }
        }
         return (s1.equals(s2));
    }
    public static void main(String[] args) {
        String s="ab#c";
        String t = "ad#c";
        System.out.println(backspaceCompare(s,t));
    }
}

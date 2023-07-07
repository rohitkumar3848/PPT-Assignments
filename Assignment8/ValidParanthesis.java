import java.util.*;
public class ValidParanthesis {
    public static boolean checkValidString(String s) {
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                s1.push(i);
            }
            else if(s.charAt(i)=='*'){
                s2.push(i);
            }
            else if(!s1.empty()){
                s1.pop();
            }
            else if(!s2.empty()){
                s2.pop();
            }
            else{
                return false;
            }
        }
        while(!s1.empty() && !s2.empty() && s1.peek()<s2.peek()){
            s1.pop();
            s2.pop();
        }
        return s1.empty();
    }
    public static void main(String[] args) {
        String s = "(*))";
        System.out.println(checkValidString(s));
    }
}
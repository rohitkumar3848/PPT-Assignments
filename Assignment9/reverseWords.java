import java.util.*;
class reverseWords {
    public static String reverseWords(String str) {
       Stack<Character> st = new Stack<>();
       String res="";
        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) != ' ')
                st.push(str.charAt(i));
            else {
                while (st.empty() == false) {
                    res=res+st.pop();
                }
                res=res+" ";
            }
        }
        while (st.empty() == false) {
            res=res+st.pop();
        } 
        return res;
    }
    public static void main(String[] args) {
        String str="My name is Rohit Kumar's";
        System.out.println(reverseWords(str));
    }
}
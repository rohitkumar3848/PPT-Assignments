import java.math.BigInteger;

public class addString{
    public static String add(String num1,String num2){
        //return ((new BigInteger(num1)).add((new  BigInteger(num2)))).toString();
        int carry=0;
        StringBuilder res=new StringBuilder();
        int i=num1.length()-1;
        int j=num2.length()-1;
        while(i>=0 || j>=0){
            int n1=(i<0)?0:num1.charAt(i)-'0';
            int n2=(j<0)?0:num2.charAt(j)-'0';
            int sum=n1+n2+carry;
            res.append(sum%10);
            carry=sum/10;
            i--;
            j--;
        }
        if(carry==1){
            res.append(carry);
        }
        return res.reverse().toString();
    }
    public static void main(String[] args) {
        String a="223";
        String b="21";
        System.out.println(add(a,b));
    }
}
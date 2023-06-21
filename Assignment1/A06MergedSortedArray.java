import java.util.*;
public class A06MergedSortedArray {
    public static void sort(int []a1,int []a2,int m,int n){
        for(int i=m,j=0;j<n;j++,i++){
            a1[i]=a2[j];
        }
        Arrays.sort(a1);
    }
    public static void main(String[] args) {
        int a1[]={1,2,3,0,0,0};
        int a2[]={2,5,6};
        int m=3;
        int n=3;
        sort(a1,a2,m,n);
        for(int i=0;i<a1.length;i++){
            System.err.print(a1[i]+" ");
        }
        
    }
}

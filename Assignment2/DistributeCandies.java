import java.util.*;
class DistributeCandies {
    public static int distributeCandies(int[] candyType) {
        Arrays.sort(candyType);
       int count=1;
       for(int i=0;i<candyType.length-1;i++){
           if(candyType[i]==candyType[i+1]){
               continue;
           }
           count++;
       }
       return Math.min(count,candyType.length/2);
    }
    public static void main(String[] args) {
        int candyType[] = {1,1,2,2,3,3};
        System.out.println(distributeCandies(candyType));
    }
}


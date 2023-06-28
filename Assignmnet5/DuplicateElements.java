import java.util.*;
class DuplicateElements {
    public static List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> a1=new ArrayList<>();
        HashSet<Integer> h1=new HashSet<>();
        for(int ele:nums){
            if(h1.contains(ele)){
                a1.add(ele);
            }
            h1.add(ele);
        }
        return a1;
    }
    public static void main(String[] args) {
        int nums[]={4,3,2,7,8,2,3,};
        System.out.println(findDuplicates(nums));
    }
}

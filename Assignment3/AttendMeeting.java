import java.util.*;
public class AttendMeeting {
    public static boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
        public int compare(int[] i1, int[] i2) {
            return i1[0] - i2[0];
        }
        });
        for(int i=0;i<intervals.length-1;i++){
            if(intervals[i][1]>intervals[i+1][0]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int intervals[][] = {{0,30},{5,10},{15,20}};
        boolean ans=canAttendMeetings(intervals);
        System.out.println(ans);
    }
}

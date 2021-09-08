package T51to100.T57;

import java.util.Arrays;

public class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
//        for (int i = 0; i < intervals.length; i++) {
//            if (intervals[i][1] < newInterval[0]){
//                continue;
//            }else if (newInterval[1] > intervals[i][0]){
//
//            }else {
//
//            }
//        }
        int i =0;
        int len =intervals.length;
        int[][] res = new int[len+1][2];
        int index = 0;
//        if (intervals[i][0] > newInterval[1]){
//            res[index][0] = intervals[i][0];
//            res[index][1] = intervals[i][1];
//            index++;
//            i++;
//        }
//        while ( i<len && intervals[i][1] < newInterval[0] ){
//            res[index][0] = intervals[i][0];
//            res[index][1] = intervals[i][1];
//            index++;
//            i++;
//        }
//        while (i<len && (newInterval[1] >= intervals[i][0] || newInterval[0] <= intervals[i][1])  ){
//            newInterval[0] = Math.min(intervals[i][0],newInterval[0]);
//            newInterval[1] = Math.max(intervals[i][1],newInterval[1]);
//            i++;
//        }
//        res[index][0] = newInterval[0];
//        res[index][1] = newInterval[1];
//        index++;
//        //i++;
//        while ( i<len && intervals[i][0] > newInterval[1] ){
//            res[index][0] = intervals[i][0];
//            res[index][1] = intervals[i][1];
//            index++;
//            i++;
//        }
//        if ( i == len && newInterval[0] > intervals[i-1][1]){
//            res[index][0] = intervals[i][0];
//            res[index][1] = intervals[i][1];
//            index++;
//        }
        while ( i<len && intervals[i][1] < newInterval[0]){
            res[index++] = intervals[i++];
        }
        while (i<len && intervals[i][0] <= newInterval[1]){
            newInterval[0] = Math.min(intervals[i][0],newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1],newInterval[1]);
            i++;
        }
        res[index++] = newInterval;

        while (i < len){
            res[index++] = intervals[i++];
        }

        return Arrays.copyOf(res,index);
    }
}

package T51to100.T56;

import java.util.*;

public class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length < 1){
            return new int[1][0];
        }
        List<List<Integer>> list = new ArrayList<>();
        Map<Integer,Integer> map = new TreeMap<>();
        for (int i = 0; i < intervals.length; i++) {
            if (map.containsKey(intervals[i][0])){
                map.put(intervals[i][0],Math.max(intervals[i][1], map.get(intervals[i][0])));
            }else {
                map.put(intervals[i][0],intervals[i][1]);
            }

        }
        //int start = Integer.MIN_VALUE;
        //int end = Integer.MIN_VALUE;
        //排好序的结果
        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        Map.Entry<Integer,Integer> entry ;
        int start = 0;
        int end = 0;
        int count = 0;
        boolean isNewStart = true;
        while (iterator.hasNext()){
            entry = iterator.next();
            if (isNewStart){
                start = entry.getKey();
                end = entry.getValue();
                isNewStart = false;
            }else {
                if (entry.getKey() <= end){
                    end = Math.max(end,entry.getValue());
                }else {
                    //int[] tmp = {start,end};
                    List<Integer> tmp = new ArrayList<>(2);
                    tmp.add(start);
                    tmp.add(end);
                    list.add(tmp);
                    count++;

                    start = entry.getKey();
                    end = entry.getValue();
                    isNewStart = false;
                }
            }
        }
        List<Integer> tmp = new ArrayList<>(2);
        tmp.add(start);
        tmp.add(end);
        list.add(tmp);
        count++;
        int[][] myIntervals = new int[count][2];
        for (int i = 0; i < list.size(); i++) {
            myIntervals[i][0] = list.get(i).get(0);
            myIntervals[i][1] = list.get(i).get(1);
        }
        return myIntervals;
    }
}

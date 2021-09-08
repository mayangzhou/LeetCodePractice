package T1to50.T30;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        Map<String,Integer>map = new HashMap<>();
        int i =0;
        for (String tmp :words
             ) {
            map.put(tmp,++i);
        }
        return null;
    }

}

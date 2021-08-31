package T3;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] array = s.toCharArray();
        Set<Character> set = new HashSet<>();
        int j =0;
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            char tmp1 = array[i];
            if (set.contains(tmp1)){
                while(set.contains(tmp1) && !set.isEmpty()){
                    set.remove(array[j++]);
                }

            }
            set.add(tmp1);
            result = Math.max(result, set.size() );

        }

        return result;
    }
}
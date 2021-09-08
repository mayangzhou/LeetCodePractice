package T1to50.T20;

import java.util.*;

public class Solution {
    public boolean isValid(String s) {
        ArrayDeque<Character> queue = new ArrayDeque<>();
        Map<Character,Character> map = new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');
        for (char c:s.toCharArray()
             ) {
            if (map.containsKey(c)){
                queue.addLast(c);
            }else {
                if (queue.size() == 0) return false;
                if (map.get(queue.getLast()) == c){
                    queue.removeLast();
                }else {
                    return false;
                }
            }
        }
        return queue.size()==0;
    }
}

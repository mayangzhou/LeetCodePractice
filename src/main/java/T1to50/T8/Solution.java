package T1to50.T8;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int myAtoi(String s) {
        StringBuilder sb = new StringBuilder();
        boolean symbolFlag = false, headFlag = true,isPositive = true;
        Map<Character,Integer> map = new HashMap<>();
        map.put('0',0);map.put('1',1);map.put('2',2);map.put('3',3);map.put('4',4);
        map.put('5',5);map.put('6',6);map.put('7',7);map.put('8',8);map.put('9',9);
        if (s == null || s.equals("")){
         return 0;
        }
        char[] chars = s.toCharArray();
        int len = chars.length;
        int i = 0;
        while (i < len){
            if (chars[i] == ' '){
                i++;
            }else {
                break;
            }
        }//头部空格
        if (i >= len){
            return  0;
        }
        if (chars[i] == '-'){
            isPositive = false;
            i++;
        }else if (chars[i] == '+'){
            i++;
        }
        while (i < len){
            if (map.containsKey(chars[i])){
                sb.append(chars[i]);
                i++;
            }else {
                break;
            }
        }
        int gen = 0;
        if (sb.length() != 0){
            for (int j = 0; j < sb.length(); j++) {
                if (gen > Integer.MAX_VALUE/10){
                    return isPositive? Integer.MAX_VALUE:Integer.MIN_VALUE;
                }else if (gen == Integer.MAX_VALUE/10){
                    if (map.get(sb.charAt(j)) >= 8 ){
                        return isPositive? Integer.MAX_VALUE:Integer.MIN_VALUE;
                    }else {
                        gen = gen*10 + map.get(sb.charAt(j));
                    }
                }else {
                    gen = gen*10 + map.get(sb.charAt(j));
                }

            }

            return isPositive?gen:-gen;
        }else {
            return 0;
        }

    }
}

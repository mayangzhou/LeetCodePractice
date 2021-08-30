package T17;

import java.util.*;

public class Solution {
    Map<Character,String> map;
    List<String> answer;
    String digits;
    public List<String> letterCombinations(String digits) {
        this.answer = new ArrayList<>();
        if (Objects.equals(digits, "")){
            return answer;
        }
        this.answer = new ArrayList<>();
        map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        this.digits = digits;
        add(new StringBuilder(),0,digits.length());
        return answer;
    }

    public void add(StringBuilder sb , int i ,int len){
        if ( i == len  ){
            answer.add(sb.toString());
        }else {
            for (char c:map.get(digits.charAt(i)).toCharArray()
                 ) {
                add(sb.append(c),i+1,len);
                sb.deleteCharAt(sb.length()-1);
            }
        }
    }
}

package T1to50.T14;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        boolean flag = true;
        if (strs == null || strs.length == 0){
            return "";
        }
        int i =0 ,minLength = strs[0].length();
        StringBuilder sb = new StringBuilder();
        for (String s:strs
        ) {
            minLength = Math.min(minLength,s.length());
        }

        while (flag && i<minLength){
            char c = strs[0].charAt(i);
            for (String s:strs
            ) {
                if (c != s.charAt(i)) {
                    flag = false;
                    break;
                }
            }
            if (flag){
                sb.append(c);
                i++;
            }

        }
        return sb.toString();
    }
}
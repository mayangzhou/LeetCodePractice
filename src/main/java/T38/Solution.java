package T38;

public class Solution {
    String[] strings = {"1","11","21","1211",
            "111221","312211","13112221","1113213211",
            "31131211131221","13211311123113112211"};
    public String countAndSay(int n) {
        if (n <=0){
            return "";
        }else if (n <= 10){
            return strings[n-1];
        }else {
            String s = countAndSay(n-1);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                int repeated = 1;
                while (i <s.length()-1 && s.charAt(i) == s.charAt(i+1)){
                    i++;
                    repeated++;
                }
                sb.append(repeated);
                sb.append(s.charAt(i));
            }
            return sb.toString();
        }
    }

}

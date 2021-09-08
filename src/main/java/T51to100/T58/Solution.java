package T51to100.T58;

public class Solution {
    public int lengthOfLastWord(String s) {
        if (s == null || s.length()<1){
            return 0;
        }
        String[] strings = s.split(" ");
        for (int i =strings.length-1 ; i >=0 ; i++) {
            if (strings[i].length() != 0){
                return strings[i].length();
            }
        }
        return 0;
    }
}

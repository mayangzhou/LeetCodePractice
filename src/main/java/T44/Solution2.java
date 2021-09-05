package T44;

public class Solution2 {
    public boolean isMatch(String s, String p) {
        char[] charS = s.toCharArray();
        char[] charP = p.toCharArray();
        int sLen = charS.length;
        int pLen = charP.length;
//        if (pLen == 0){
//            if (sLen != 0){
//                return false;
//            }else return true;
//        }
//
//        if (sLen == 0){
//            for (int i = 0; i < pLen; i++) {
//                if (charP[i] != '*'){
//                    return false;
//                }
//            }
//            return true;
//        }


        boolean[][] dp= new boolean[sLen+1][pLen+1];
        dp[0][0] = true;
        for (int i = 1; i < pLen+1; i++) {
            if (charP[i-1] == '*'){
                dp[0][i] = true;
            }else {
                break;
            }
        }
        for (int i = 1; i <= pLen; i++) {
            for (int j = 1; j <= sLen; j++) {
                if (charP[i-1]==charS[j-1] || charP[i-1] == '?'){
                    dp[j][i] = dp[j-1][i-1];
                }else if (charP[i-1] == '*'){
                    dp[j][i] = (dp[j-1][i] || dp[j][i-1]);
                }
            }
        }
        return dp[sLen][pLen];
    }
}

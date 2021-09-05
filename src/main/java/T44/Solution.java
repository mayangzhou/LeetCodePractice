package T44;

public class Solution {
    public boolean isMatch(String s, String p) {
        char[] charS = s.toCharArray();
        char[] charP = p.toCharArray();
        int sLen = charS.length;
        int pLen = charP.length;
        if (pLen == 0){
            if (sLen != 0){
                return false;
            }else return true;
        }

        if (sLen == 0){
            for (int i = 0; i < pLen; i++) {
                if (charP[i] != '*'){
                    return false;
                }
            }
            return true;
        }

//        boolean[][] dp= new boolean[sLen][pLen];
//        for (int i = 0; i < pLen; i++) {
//            for (int j = 0; j < sLen; j++) {
//                if (charP[i]=='*'){
//                    dp[j][i] = true;
//                }else if (charP[i] == charS[j]){
//                    dp[j][i] = true;
//                }
//            }
//        }
        return Recurrent(charS,charP,sLen,pLen,0,0);
    }
    public boolean judge(char[] charS,char[] charP,int i ,int j){
        if (charP[i] == '?' || charP[i] == '*'){
            return true;
        }else {
            if (charP[i] == charS[j]){
                return true;
            }else {
                return false;
            }
        }
    }

    public boolean Recurrent(char[] charS,char[] charP,int sLen,int pLen,int i ,int j ){
        if (!judge(charS,charP,i,j)){
            return false;
        }
        if (i == pLen-1 && j == sLen-1){
            return true;
        }else if (i < pLen-1 && j == sLen-1){
            if (charP[i] == '*'){
                return Recurrent(charS,charP,sLen,pLen,i+1,j);
            }else {
                for (int k = i+1; k < pLen; k++) {
                    if (charP[k] != '*'){
                        return false;
                    }
                }
                return true;

            }


            //return Recurrent(charS,charP,sLen,pLen,i+1,j);
        }else if (i == pLen-1 && j < sLen-1){
            if (charP[i] == '*'){
                return true;
            }else {
                return false;
            }
            //return Recurrent(charS,charP,sLen,pLen,i,j+1);
        }else {
            if (charP[i] == '*'){
                return (Recurrent(charS,charP,sLen,pLen,i,j+1) ) ||
                        (Recurrent(charS,charP,sLen,pLen,i+1,j+1)) ||
                        (Recurrent(charS,charP,sLen,pLen,i+1,j) );
            }else {
                return Recurrent(charS,charP,sLen,pLen,i+1,j+1);
            }
        }
    }
}

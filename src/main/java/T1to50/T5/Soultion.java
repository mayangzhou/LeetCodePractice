package T1to50.T5;

public class Soultion {
    public String longestPalindrome(String s) {
        if(s == null || s.equals("")){
            return  "";
        }
        char[] chars = s.toCharArray();
        int charLength = chars.length;
        int[][] matrix = new int[charLength][charLength];
        int i=0,j=0;
        int start = 0, end = 0, max = 0;
        while( j < charLength){
            i = 0;
            while( i < charLength && i+j < charLength){
                if (j == 0){
                    matrix[i][i+j] = 1;
                    if (j + 1 > max){
                        max = j+1;
                        start = i;
                        end = j;
                    }
                }else if (j == 1){
                    if (chars[i]==chars[i+j]){
                        matrix[i][i+j] = 1;
                        if (j + 1 > max){
                            max = j+1;
                            start = i;
                            end = i+j;
                        }
                    }
                }else{
                    if (matrix[i+1][i+j-1] == 1 && chars[i]==chars[i+j] ){
                        matrix[i][i+j] = 1;
                        if (j + 1 > max){
                            max = j+1;
                            start = i;
                            end = i+j;
                        }
                    }
                }

                i++;
            }
            j++;
        }
        StringBuilder ret = new StringBuilder(new String());
        for (int k = start; k <= end ; k++) {
            ret.append(chars[k]);
        }
        return ret.toString();

    }
}

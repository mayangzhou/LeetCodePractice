package T1to50.T32;

public class Solution {
    public int longestValidParentheses(String s) {
        if (s.length() <2){
            return 0;
        }
        char[] chars = s.toCharArray();
        int len = chars.length;
        //源思路被淘汰 使用动规
        int[] dp = new int[len];
        dp[0] = 0;
        int maxLen = 0;
        for (int i = 1; i < len; i++) {
            if (chars[i] == '('){
                dp[i] = 0;
            }else {
                if (chars[i-1] == '('){
                    dp[i] = i-2>=0?dp[i-2]+2:2;
                }else {
                    //i ) i-1也是)
                    if (dp[i-1] ==0){
                        dp[i] = 0;
                        continue;
                    }
                    if (i-dp[i-1]-1 >=0 && chars[i-dp[i-1]-1] == '('){
                            dp[i] = dp[i-1]+2;
                            if (i-dp[i-1]-2 >=0){
                                dp[i] += dp[i-dp[i-1]-2];
                            }
                    }else {
                        dp[i] = 0;
                    }
                }
            }
            maxLen = Math.max(maxLen,dp[i]);
        }
        return maxLen;
    }
}

//        Set<Integer> set = new TreeSet<>();
//        for (int i = 0; i < len; i++) {
//            if (chars[i] == '('){
//                set.add(i);
//            }
//        }
//        //List<Integer> list = new ArrayList<>();
//        Set<Integer> noIterSet = new HashSet<>();
//        int maxLen = 0;
//        int valid = 0;
//        int size =0;
//        for (int k:set
//             ) {
//            if (noIterSet.contains(k)){
//                continue;
//            }
//            valid = 1;
//            size =1;
//            for (int i = k+1; i < len; i++) {
////                if (set.contains(i)){
////                    set.remove(i);
////                }
//
//                if (set.contains(i)){
//                    noIterSet.add(i);
//                }
//                if (chars[i] == '('){
//                    valid++;
//                }else {
//                    valid--;
//                }
//                size++;
//                if (valid < 0) {break;}else if(valid == 0){
//                    if (size > maxLen){
//                        maxLen = size;
//                    }
//                }
//            }
//            //循环结束以后
//            if(valid == 0){
//                if (size > maxLen){
//                    maxLen = size;
//                }
//            }else if (valid > 0){
//                int tmp = size - valid;
//                maxLen = Math.max(tmp,maxLen);
//            }
//            //size = size - Math.abs(valid);
//
//        }
//        return maxLen;

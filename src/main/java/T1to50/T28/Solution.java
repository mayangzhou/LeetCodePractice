package T1to50.T28;

public class Solution {
    public int strStr(String haystack, String needle) {
//        if (needle == null || needle.length()==0) return 0;
//        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
//            for (int j = 0; j < needle.length(); j++) {
//                if (haystack.charAt(i+j) != needle.charAt(j)){
//                    break;
//                }
//                if (j == needle.length()-1){
//                    return i;
//                }
//            }
//
//        }
//        return -1;
        //源思路频繁使用str的charAt函数 速度太低 但是如下的思路使用char数组的方法仍然不对
//        if (needle == null || needle.length()==0) return 0;
//        char[] chars1 = haystack.toCharArray();
//        char[] chars2 = needle.toCharArray();
//        for (int i = 0; i < chars1.length - chars2.length+1; i++) {
//            for (int j = 0; j < chars2.length; j++) {
//                if (chars1[i+j] != chars2[j]){
//                    break;
//                }
//                if (j == chars2.length-1){
//                    return i;
//                }
//            }
//        }
//        return -1;
        return -1;
    }
}

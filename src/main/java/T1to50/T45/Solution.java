package T1to50.T45;

public class Solution {
    public int jump(int[] nums) {
        int len = nums.length;
        int start = 0;
        int count =0;
        int next = 0;
        while (start < len-1){
            int maxLen = start;
            int tmp;
            if (start+nums[start] >= len-1){
                return count+1;
            }
            for (int i = 1; i <=nums[start] ; i++) {
                tmp = start+i+nums[start+i];
                if (tmp > maxLen){
                    maxLen = tmp;
                    next = start+i;
                }

//                if (maxLen >= len-1){
//                    return count+2;
//                }

            }
            start = next;
            count++;
        }
        return count;//?
    }

}

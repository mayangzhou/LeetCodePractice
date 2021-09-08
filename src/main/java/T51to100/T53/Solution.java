package T51to100.T53;

public class Solution {
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int max = nums[0];
        int tmpSum = max;
        int[] dp = new int[len];
        dp[0] = nums[0];
        for (int i = 1; i < len; i++) {
            //dp[i] = Math.max(Math.max(dp[i-1],dp[i-1]+nums[i]),nums[i]);
            if(dp[i-1] < 0){
                dp[i] = nums[i];
            }else {
                dp[i] = dp[i-1] + nums[i];
            }
            max = Math.max(dp[i],max);
        }
        return max;
    }
}

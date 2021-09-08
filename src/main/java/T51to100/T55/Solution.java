package T51to100.T55;

public class Solution {
    public boolean canJump(int[] nums) {
        boolean[] dp = new boolean[nums.length];
        dp[nums.length-1] =true;
        for (int i = nums.length-2; i >=0 ; i--) {
            for (int j = i; j <= i+nums[i] && j< nums.length; j++) {
                if (dp[j]){
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[0];
    }
}

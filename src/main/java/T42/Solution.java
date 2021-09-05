package T42;

public class Solution {
    public int trap(int[] height) {
        int len = height.length;
        int[] maxLeft = new int[len];
        int[] maxRight = new int[len];
        for (int i = 1; i < len-1; i++) {
            maxLeft[i] = Math.max(maxLeft[i-1],height[i-1] );
            maxRight[len-i-1] = Math.max(maxRight[len-i],height[len-i]);
        }
        int ans = 0;
        for (int i = 1; i < len-1; i++) {
            int tmp = Math.min(maxLeft[i],maxRight[i]);
            if (tmp > height[i]){
                ans += tmp - height[i];
            }
        }
        return ans;
    }
}

package T1to50.T11;

public class Solution {
    public int maxArea(int[] height) {
        if (height == null || height.length == 0){
            return 0;
        }
        int start = 0,end = height.length-1;
        int v = (end-start)*Math.min(height[start],height[end]);
        while (start < end ){
            v = height[start]<height[end]? Math.max(v,(end-start)*height[start++]):Math.max(v,(end-start)*height[end--]);
        }

        return v;
    }
}

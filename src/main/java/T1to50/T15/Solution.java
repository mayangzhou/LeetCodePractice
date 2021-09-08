package T1to50.T15;

import java.util.*;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        int len = nums.length;
        if (len < 3){
            return lists;
        }
//        Map<Integer,List<Integer>> map = new HashMap<>();
//        for (int i = 0; i < len; i++) {
//            for (int j = i+1; j < len; j++) {
//                int tmpSum = nums[i] + nums[j];
//                if (map.containsKey(-nums[j])){
//
//                }
//            }
//        }
        //排序+双指针  解法
        Arrays.sort(nums);

        for (int i = 0; i < len -2; i++) {
            if ( i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int left = i+1 , right = len-1;
            while (left < right){
                int tmp = nums[i]+nums[left]+nums[right];
                if (tmp == 0){
                    List<Integer>integerList = new ArrayList<>();
                    integerList.add(nums[i]);
                    integerList.add(nums[left]);
                    integerList.add(nums[right]);
                    lists.add(integerList);
                    //此时已经添加一个数据 需要进行去重
                    while ( left<right && nums[left] == nums[left+1]) left++;
                    while (left<right && nums[right] == nums[right-1]) right--;
                    left++;right--;
                }else if (tmp > 0){
                    right--;
                }else {
                    left++;
                }

            }
        }
        return lists;

    }
}

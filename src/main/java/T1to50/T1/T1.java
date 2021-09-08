package T1to50.T1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/*1. 两数之和
给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
你可以按任意顺序返回答案。
示例 1：
输入：nums = [2,7,11,15], target = 9
输出：[0,1]
解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
示例 2：
输入：nums = [3,2,4], target = 6
输出：[1,2]
示例 3：
输入：nums = [3,3], target = 6
输出：[0,1]
提示：
2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
只会存在一个有效答案
进阶：你可以想出一个时间复杂度小于 O(n2) 的算法吗？*/
public class T1 {
    public static void main(String[] args) {
            InputStreamReader is = new InputStreamReader(System.in);
            BufferedReader bf = new BufferedReader(is);
            try {
//            Pattern r = Pattern.compile("(\\[((\\d+,)|(\\d+))\\])*");
//            Matcher m = r.matcher(bf.readLine());
//            if(m.find()){
//                System.out.println(m.group(0));
//                System.out.println(m.group(1));
//            }else{
//                System.out.println("not found");
//            }
                String[] line = bf.readLine().split("=");
                //输入：nums = [2,7,11,15], target = 9
                //ArrayList<Integer> nums = new ArrayList<>();
                Map<Integer,Integer> map = new HashMap<>();
                int j = 0;
                int target = Integer.parseInt(line[2].replace(" ",""));
                for (String str:line[1].split("]")[0].replace("[","").split(",")
                ) {
                    int tmp = Integer.valueOf(str.replace(" ",""));
                    if (map.containsKey(target - tmp)){
                        System.out.println("["+map.get(target - tmp) + ","+ j+"]");
                    }
                    map.put(tmp,j++);
                }
                //Collections.sort(nums);

            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}

package leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RelativeRanks {

    public String[] findRelativeRanks(int[] nums) {
        if(nums.length == 1){
            return new String[]{"Gold Medal"};
        }
        if(nums.length == 2) {
            if(nums[0] >= nums[1]) {
                return new String[]{"Gold Medal", "Silver Medal"};
            }
            else {
                return new String[] {"Silver Medal", "Gold Medal"};
            }
        }
        Map<Integer, Integer> numsMap = new HashMap<>();
        for(int i = 0;i < nums.length; i ++) {
            numsMap.put(nums[i], i);
        }
        Arrays.sort(nums);
        String[] result = new String[nums.length];
        for(int i = 0; i < nums.length - 3; i ++) {
            result[numsMap.get(nums[i])] = nums.length - i + "";
        }
        result[numsMap.get(nums[nums.length - 3])] = "Bronze Medal";
        result[numsMap.get(nums[nums.length - 2])] = "Silver Medal";
        result[numsMap.get(nums[nums.length - 1])] = "Gold Medal";
        return result;
    }
}

package leetcode.easy;

import java.util.Arrays;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        System.out.println(nums);
        for(int i = 0; i < nums.length / 2; i ++) {
            if(nums[i] == nums[i + nums.length / 2]) {
                return nums[i];
            }
            else {
                i ++;
            }
        }
        for(int i = nums.length - 1; i >= nums.length / 2; i --) {
            if(nums[i] == nums[i - nums.length / 2]) {
                return nums[i];
            }
            else {
                i --;
            }
        }
        return 0;
        
    }
}

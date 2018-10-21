package leetcode.easy;

import java.util.Arrays;

public class MinimumMovesToEqualArrayElements {

    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        while(nums[0] != nums[nums.length - 1]) {
            count ++;
            for(int i = 0; i <= nums.length - 1; i ++) {
                nums[i] ++;
                System.out.println(nums[i]);
            }
            Arrays.sort(nums);
        }  
        System.out.println(nums[0]);
        return count;
    }
}

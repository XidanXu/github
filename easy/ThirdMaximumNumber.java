package leetcode.easy;

import java.util.Arrays;

public class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i ++) {
            if(nums[i] > firstMax && nums[i] > secondMax && nums[i] > thirdMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = nums[i];
                System.out.println(firstMax);
            }
            else if(nums[i] < firstMax && nums[i] > secondMax && nums[i] > thirdMax) {
                thirdMax = secondMax;
                secondMax = nums[i];
                System.out.println(secondMax);
            }
            else if(nums[i] < firstMax && nums[i] < secondMax && nums[i] > thirdMax) {
                thirdMax = nums[i];
                System.out.println(thirdMax);
            }
        }
        if(thirdMax != Integer.MIN_VALUE) {
            return thirdMax;
        }
        //-2147483648
        else {
            return firstMax;
        }
    }
    
}

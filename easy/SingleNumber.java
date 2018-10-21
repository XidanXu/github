package leetcode.easy;

import java.util.Arrays;

public class SingleNumber {
    //own solution
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums.length == 1) {
            return nums[0];
        }
        int i = 0;
        int j = 1;
        while(j <= nums.length - 1) {
            if(i == 0) {
                i = j;
                j = j + 1;
                if(nums[i] == nums[j]) {
                    return nums[0];
                }
            }
            if(j == nums.length - 1) {
                if(nums[i] != nums[j]) {
                    return nums[j];
                }
            }
            if(nums[i] != nums[j]) {
                i = j;
                j = j + 1;
                if(nums[i] != nums[j]) {
                    return nums[i];
                }
            }
            i ++;
            j ++;
        }
        return 0;
    }
    
    //XOR
//    int singleNumber(int A[], int n) {
//        int result = 0;
//        for (int i = 0; i<n; i++)
//        {
//            result ^=A[i];
//        }
//        return result;
//    }
}

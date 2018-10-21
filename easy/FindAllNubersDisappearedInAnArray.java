package leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAllNubersDisappearedInAnArray {
    //Mark index as negative which shows that is appeared
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        
        for(int i = 0; i < nums.length ; i ++) {
            nums[Math.abs(nums[i]) - 1] = - Math.abs(nums[Math.abs(nums[i]) - 1]);
        }
        for(int i = 0; i < nums.length; i ++) {
            if(nums[i] >= 0) {
                result.add(i + 1);
            }
        }
        return result;
    }
    //O(n2)
//    public List<Integer> findDisappearedNumbers(int[] nums) {
//        if(nums.length == 0) {
//            return new ArrayList<>();
//        }
//        Arrays.sort(nums);
//        List<Integer> result = new ArrayList<>();
//
//
//        for(int i = 1; i < nums[0]; i ++) {
//            result.add(i);
//        }
//        for(int i = 1; i < nums.length; i ++){
//            if(nums[i] - nums[i - 1] >= 2) {
//                for(int j = nums[i - 1] + 1; j < nums[i]; j ++) {
//                    result.add(j);
//                }
//            }
//        }
//        for(int i = nums[nums.length - 1] + 1;i <= nums.length; i ++) {
//            result.add(i);
//        }
//        return result;
//    }
}

package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsII {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums == null) {
            return result;
        }
        if(nums.length == 0) {
            result.add(new ArrayList<>());
            return result;
        }
        Arrays.sort(nums);
        helper(nums, new ArrayList<>(), result, 0);
        return result;
    }
    
    public void helper(int[] nums, List<Integer> subset, List<List<Integer>> result, int startIndex) {
        if(!result.contains(subset)) {
            result.add(new ArrayList(subset));
        }
        for(int i = startIndex; i < nums.length; i ++) {           
            subset.add(nums[i]);
            System.out.println(subset);            
            helper(nums, subset, result, i + 1);            
            subset.remove(subset.size() - 1);
        }        
    }
}

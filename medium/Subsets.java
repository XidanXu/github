package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        if(nums == null || nums.length == 0){
            return results;
        }
        Arrays.sort(nums);
        helper(new ArrayList<Integer>(), nums, 0, results);
        
        return results;
    }
    
    public void helper(ArrayList<Integer> subset, int[] nums, int startIndex,List<List<Integer>> results){
        results.add(new ArrayList<Integer>(subset));
        
        for(int i = startIndex; i < nums.length; i ++){
            subset.add(nums[i]);
            helper(subset, nums, i + 1, results);
            subset.remove(subset.size() - 1);
        }
    }
}

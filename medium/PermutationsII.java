package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class PermutationsII {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums == null){
            return result;
        }
        if(nums.length == 0){
            result.add(new ArrayList<>());
            return result;
        }
        
        helper(result, nums, new ArrayList<>(), new boolean[nums.length]);
        return result;
    }
    
    public void helper(List<List<Integer>> result, int[] nums, List<Integer> subset, boolean[] used){
        
        if(subset.size() == nums.length){
            result.add(new ArrayList<>(subset));
        }
        else{
            for(int i = 0; i < nums.length; i ++){
                if(used[i] == true) {
                    continue;
                }
                subset.add(nums[i]);
                used[i] = true;
                helper(result, nums, subset, used);
                used[i] = false;
                subset.remove(subset.size() - 1);
            }
        }
        
    }
}

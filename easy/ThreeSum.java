package leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ThreeSum {

//    public List<List<Integer>> threeSum(int[] nums) {
//        Arrays.sort(nums);
//        List<List<Integer>> result = new ArrayList<>();
//        Map<List, Integer> sum = new HashMap<>();
//        
//        for(int i = 0 ; i < nums.length - 2; i ++){
//            for(int j = i + 1; j < nums.length - 1; j ++) {
//                for(int k = j + 1; k < nums.length; k ++) {
//                    List<Integer> ijk = new ArrayList<>();
//                    ijk.add(nums[k]);
//                    ijk.add(nums[j]);
//                    ijk.add(nums[i]);
//                    sum.put(ijk, (nums[i] + nums[j] + nums[k]));
//                }
//            }
//        }
//        System.out.println(sum.entrySet());
//        
//        for(List<Integer> s : sum.keySet()) {
//            if(sum.get(s) == 0 && !result.contains(s)) {
//                result.add(s);
//             
//            }
//            
//        }
//                
//        
//        return result; 
//    }
    
    public List<List<Integer>> threeSum(int[] nums) {
        //List<Integer> sum = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i ++) {
            int j = i + 1;
            int k = nums.length - 1;
            while(j < k) {
                if(nums[j] + nums[k] == 0 - nums[i]) {
                    List<Integer> sum = new ArrayList<>();
                    sum.add(nums[k]);
                    sum.add(nums[j]);
                    sum.add(nums[i]);
                    if(!result.contains(sum)) {
                        result.add(sum);
                    }
                    
                }
                else if(nums[j] + nums[k] > 0 - nums[i]) {
                    k --;
                }
                else {
                    j ++;
                }
            }
        }
        
        return result;
    }
}

package leetcode.medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation {

    public static List<List<Integer>> permute(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
      
        if(nums == null) {
            return result;
        }
        if(nums.length == 0) {
            result.add(new ArrayList<>());
            return result;
        }
        helper(nums, new ArrayList<>(), result);
        return result;
        
    }
    
    public static void helper(int[] nums, List<Integer> subset, List<List<Integer>> result) {
        
        if(subset.size() == nums.length) {
            result.add(new ArrayList<>(subset));
        }
        else {
            for(int i = 0; i < nums.length; i ++) {
                if(subset.contains(nums[i])) {
                    continue;
                }
                subset.add(nums[i]);
                helper(nums, subset, result);
                subset.remove(subset.size() - 1);
            }
        }
        
    }
    
    //wrong solution
//    public static List<List<Integer>> permute(int[] nums) {
//        
//        List<List<Integer>> result = new ArrayList<>();
//        if(nums == null){
//            return result;
//        }
//        if(nums.length == 0){
//            result.add(new ArrayList<Integer>());
//            return result;
//        }
//        int[] numsNew = new int[nums.length];
//        for(int i = nums.length - 1; i >= 0; i --) {
//            numsNew[i] = nums[nums.length - 1 - i];
//        }
//        helper(new ArrayList<>(), nums, result);
//        helper(new ArrayList<>(), numsNew, result);
//        return result;
//    }
//    
//    public static void helper(ArrayList<Integer> subset, int[] nums, List<List<Integer>> result) {
//        //result.add(subset);
//        
//        for(int i = 0; i < nums.length; i ++) {
//            for(int j = 0; j < nums.length; j ++) {
//                if(j != i) {
//                    subset.add(nums[j]);
//                    System.out.println(nums[j]);
//                }
//            }
//            for(int k = 0 ; k < nums.length; k ++) {
//                subset.add(k, nums[i]);
//                System.out.println("subset:" + subset);
//                if(!result.contains(subset)) {
//                    result.add(new ArrayList<>(subset));
//                }
//                System.out.println("result:" + result);
//                subset.remove(k);
//                System.out.println("subset:" + subset);
//      
//            }
//            
//            subset = new ArrayList<>();    
//        }
//            
//        
//        //result.add(subset);
//    }
    
    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
          return new int[0];
        }
    
        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }
    
    public static String integerArrayListToString(List<Integer> nums, int length) {
        if (length == 0) {
            return "[]";
        }
    
        String result = "";
        for(int index = 0; index < length; index++) {
            Integer number = nums.get(index);
            result += Integer.toString(number) + ", ";
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }
    
    public static String integerArrayListToString(List<Integer> nums) {
        return integerArrayListToString(nums, nums.size());
    }
    
    public static String int2dListToString(List<List<Integer>> nums) {
        StringBuilder sb = new StringBuilder("[");
        for (List<Integer> list: nums) {
            sb.append(integerArrayListToString(list));
            sb.append(",");
        }
    
        sb.setCharAt(sb.length() - 1, ']');
        return sb.toString();
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int[] nums = stringToIntegerArray(line);
            
            List<List<Integer>> ret = permute(nums);
            
            String out = int2dListToString(ret);
            
            System.out.print(out);
        }
    }
}

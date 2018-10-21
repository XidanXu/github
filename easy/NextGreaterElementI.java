package leetcode.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElementI {

	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
		 Map<Integer, Integer> result = new HashMap<>();
		 Stack<Integer> biggerOne = new Stack<>();
		 for(int num: nums2) {
			 while(!biggerOne.isEmpty() && num > biggerOne.peek()) {
				 result.put(biggerOne.pop(), num);
			 }
			 biggerOne.push(num);
		 }
		 int[] resultArray = new int[nums1.length];
		 for(int i = 0; i < nums1.length; i ++) {
			 resultArray[i] = result.getOrDefault(nums1[i], -1);
		 }
		 return resultArray;
	}
	
	//My solution O(n^2)
//	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
//        int[] result = new int[nums1.length];
//        for(int i = 0; i < nums1.length; i ++){
//            boolean flag = false;
//            int j = 0;
//            for(j = 0;j < nums2.length; j ++){
//                if(nums1[i] == nums2[j]){
//                    flag = true;
//                    continue;
//                }
//                if(flag == true){
//                    if(nums2[j] > nums1[i]){
//                        result[i] = nums2[j];
//                        break;
//                    }
//                }
//            }
//            if(j == nums2.length){
//                result[i] = -1;
//            }
//        }
//        return result;
//    }
}

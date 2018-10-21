package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoArraysII {

    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> nums1List = new ArrayList<Integer>();
        for(int i = 0; i < nums1.length; i ++) {
            nums1List.add(i, nums1[i]);
        }
        List<Integer> intersection = new ArrayList<Integer>();
        for(int i = 0; i < nums2.length ; i ++) {
            if(nums1List.contains(nums2[i])) {
                intersection.add(nums2[i]);
                
                nums1List.remove(nums2[i]);
                nums1List.add(Integer.MAX_VALUE);
                
            }
        }
        int[] result = new int[intersection.size()];
        int i = 0;
        for(int temp:intersection) {
            result[i] = intersection.get(i);
            i ++;
        }
        return result;
    }
}

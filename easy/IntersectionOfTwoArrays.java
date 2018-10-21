package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> nums1Set = new HashSet<>();
        for(int i = 0; i < nums1.length ; i++) {
            nums1Set.add(nums1[i]);
        }
        Set<Integer> intersection = new HashSet<>();
        for(int i = 0; i < nums2.length; i ++) {
            if(nums1Set.contains(nums2[i])) {
                intersection.add(nums2[i]);
            }
        }
        int[] result = new int[intersection.size()];

        int i = 0;
        for(int temp:intersection) {
            result[i] = temp;
            i ++;    
        }
        return result;
    }
}

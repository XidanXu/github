package leetcode.easy;

public class LatestPositionOfTarget {
//#458 lintcode
	public int lastPosition(int[] nums, int target) {
        if(nums == null || nums.length == 0){
            return -1;
        }
        // write your code here
        int start = 0;
        int end = nums.length - 1;
        
        while(start + 1 < end){
            int mid = start + (end - start) / 2;
            if(target >= nums[mid]){
                start = mid;
            }
            if(target < nums[mid]){
                end = mid;
            }
        }
        if(nums[end] == target){
            return end;
        }
        if(nums[start] == target){
            return start;
        }
        return -1;
    }
}

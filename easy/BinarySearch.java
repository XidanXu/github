package leetcode.easy;

public class BinarySearch {

    public int search(int[] nums, int target) {
        if(nums == null || nums.length == 0) {
            return -1;
        }
        int start = 0, end = nums.length - 1;
        
        while(start + 1 < end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] == target) {
                return mid;
                //很多时候不能直接return
            }
            else if(nums[mid] < target) {
                start = mid;
            }
            else if(nums[mid] > target) {
                end = mid;
            }
        }
        //处理剩下的相邻关系的两个数
        if(nums[start] == target) {
            return start;
        }
        //coding style: if has return in IF--do not use ELSE IF, just using IF
        if(nums[end] == target) {
            return end;
        }
        return -1;
    }
}

package leetcode.medium;

public class SearchForARange {
//lintcode #61
    public class Solution {
        /**
         * @param A: an integer sorted array
         * @param target: an integer to be inserted
         * @return: a list of length 2, [index1, index2]
         */
        public int[] searchRange(int[] A, int target) {
            if(A == null || A.length == 0){
                return new int[]{-1,-1};
            }
            int startRes = -1;
            int endRes = -1;
            // write your code here
            int start = 0;
            int end = A.length - 1;
            
            while(start + 1 < end){
                int mid = start + (end - start) / 2;
                if(A[mid] >= target){
                    end = mid;
                }
                if(A[mid] < target){
                    start = mid;
                }
            }
            
            if(A[start] == target){
                startRes = start;
            }
            else if(A[end] == target){
                startRes = end;
            }
            
            start = 0;
            end = A.length - 1;
            while(start + 1 < end){
                int mid = start + (end - start) / 2;
                if(A[mid] > target){
                    end = mid;
                }
                if(A[mid] <= target){
                    start = mid;
                }
            }
            if(A[end] == target){
                endRes = end;
            }
            else if(A[start] == target){
                endRes = start;
            }
            return new int[]{startRes, endRes};
        }
        
    }
}

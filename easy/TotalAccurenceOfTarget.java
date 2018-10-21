package leetcode.easy;

public class TotalAccurenceOfTarget {
//lintcode #462
    public int totalOccurrence(int[] A, int target) {
        if(A == null || A.length == 0){
            return 0;
        }
        // write your code here
        int start = 0;
        int end = A.length - 1;
        
        while(start + 1 < end){
            int mid = start + (end - start) / 2;
            if(A[mid] >= target){
                end = mid;
            }
            else if(A[mid] < target){
                start = mid;
            }
        }
        int finalStart = start;
        if(A[start] != target && A[end] == target){
            finalStart = end;
        }
        if(A[start] != target && A[end] != target){
            return 0;
        }
        
        
        start = 0;
        end = A.length - 1;
        
        while(start + 1 < end){
            int mid = start + (end - start) / 2;
            if(A[mid] > target){
                end = mid;
            }
            else if(A[mid] <= target){
                start = mid;
            }
           
        }
        int finalEnd = end;
        if(A[end] != target && A[start] == target){
            finalEnd = start;
        }
        
        return finalEnd - finalStart + 1;
    }
}

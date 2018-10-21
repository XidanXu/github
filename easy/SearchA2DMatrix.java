package leetcode.easy;

public class SearchA2DMatrix {
//lintcode 28
    //binary search version
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0){
            return false;
        }
        int left = 0;
        int right = matrix[0].length - 1;
        int up = 0;
        int down = matrix.length - 1;
        
        while(up + 1 < down) {
            int mid = up + (down - up) / 2;
            if(matrix[mid][matrix[0].length - 1] == target) {
                return true;
            }
            else if(matrix[mid][matrix[0].length - 1] < target) {
                up = mid;
            }
            else {
                down = mid;
            }
        }
        if(target == matrix[up][matrix[0].length - 1]) {
            return true;
        }
        if(target == matrix[down][matrix[0].length - 1]) {
            return true;
        }
        if(target > matrix[up][matrix[0].length - 1] ) {
            up = down;
        }
        
        while(left + 1 < right) {
            int mid = left + (right - left) / 2;
            if(matrix[up][mid] == target) {
                return true;
            }
            else if(matrix[up][mid] > target) {
                right = mid;
            }
            else {
                left = mid;
            }
        }
        if(matrix[up][left] == target) {
            return true;
        }
        if(matrix[up][right] == target) {
            return true;
        }
        return false;
    }
    
    //not binary search
//    public boolean searchMatrix(int[][] matrix, int target) {
//        // write your code here
//        if(matrix == null || matrix.length == 0){
//            return false;
//        }
//        
//        
//        int starti = 0;
//        int endi = matrix.length - 1;
//        
//        int startj = 0;
//        int endj = matrix[0].length - 1;
//        if(target > matrix[endi][endj]){
//            return false;
//        }
//        
//        while(endi < matrix.length && endj > 0){
//            if(matrix[starti][endj] < target){
//                starti ++;
//            }
//            if(matrix[starti][endj] > target){
//                endj --;
//            }
//            if(matrix[starti][endj] == target){
//                return true;
//            }
//        }
//        return false;
//        
//        
//    }
}

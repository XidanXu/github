package leetcode.medium;

public class SearchA2DMatrixII {
    public int searchMatrix(int[][] matrix, int target) {
        // write your code here
        if(matrix == null || matrix.length == 0){
            return 0;
        }
        int count = 0;
        
        int left = 0;
        int right = matrix[0].length - 1;
        
        int up = 0;
        int down = matrix.length - 1;
        
        while(up < down && left < right){
            if(target == matrix[up][right] && right > 0 && up < down){
                count ++;
                right --;
                up ++;
                System.out.println("right:" + right);
                System.out.println("up:" + up);
            }
            else if(target > matrix[up][right] && up < down){
                up ++;
            }
            else if(target < matrix[up][right] && right > 0){
                right --;
            }
        }
        boolean flagA = false;
        boolean flagB = false;
        boolean flagC = false;
        if(up == down && left != right){
            flagA = true;
        }
        if(up != down && left == right){
            flagB = true;
        }
        if(up == down && left == right){
            flagC = true;
        }
        if(flagA == true){
            while(left + 1 < right){
                int mid = left + (right - left) / 2;
                if(matrix[up][mid] == target){
                    count ++;
                    break;
                }
                else if(matrix[up][mid] > target){
                    right = mid;
                }
                else{
                    left = mid;
                }
            }
            if(matrix[up][left] == target){
                count ++;
            }
            if(matrix[up][right] == target){
                count ++;
            }
        }
        if(flagB == true){
            while(up + 1 < down){
                int mid = up + (down - up) / 2;
                if(matrix[mid][left] == target){
                    count ++;
                    break;
                }
                else if(matrix[mid][left] > target){
                    down = mid;
                }
                else{
                    up = mid;
                }
            }
            if(matrix[up][left] == target){
                count ++;
            }
            if(matrix[down][left] == target){
                count ++;
            }
        }
        if(flagC == true){
            if(matrix[up][left] == target){
                count ++;
            }
        }
            
        
        return count;
    }
}

package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class PathSum {

    //solution--DFS
    public int pathSum(TreeNode root, int sum) {
        if(root == null) {
            return 0;
        }
        return pathSum(root.left, sum)  + pathSum(root.right, sum) + pathSumFrom(root, sum);
        
    }
    
    public int pathSumFrom(TreeNode root, int sum) {
        if(root == null) {
            return 0;
        }
        return (root.val == sum ? 1: 0) + pathSumFrom(root.left, sum - root.val) + pathSumFrom(root.right, sum - root.val);
    }
    
    
}

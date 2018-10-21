package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePath {

    public List<String> binaryTreePaths(TreeNode root) {
        
        List<String> resultList = new ArrayList<>();
        int count = 0;
        resultList.add(count, TreePathsString(root));
        return resultList;
    }
    
    public String TreePathsString(TreeNode root) {
        String result = new String();
         if(root == null) {
             return result;
         }
         if(root != null && root.left == null && root.right == null) {
             result = result + ">-" + root.val;
         }
         else {
             result += TreePathsString(root.left);
             result += TreePathsString(root.right);
         }
        return result;
    }
    
}

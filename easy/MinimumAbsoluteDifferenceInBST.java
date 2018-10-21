package leetcode.easy;

public class MinimumAbsoluteDifferenceInBST {

    public int getMinimumDifference(TreeNode root) {
        
        if(root == null){
            return Integer.MAX_VALUE;
        }
        int min = Integer.MAX_VALUE;
        
        return Math.min(min, Math.min(Math.abs(root.val - getMinimumDifference(root.left)), Math.abs(root.val - getMinimumDifference(root.right))));
    }
    
    public int getMinimumNodeDifference(TreeNode root) {
        if(root == null) {
            return Integer.MAX_VALUE;
        }
        int min = Integer.MAX_VALUE;
        if(root.left != null) {
            if(min > Math.abs(root.val - root.left.val)) {
                min = Math.abs(root.val - root.left.val);
            }
        }
        if(root.right != null) {
            if(min > Math.abs(root.val - root.right.val)) {
                min = Math.abs(root.val - root.right.val);
            }
        }
        return Math.min(min, Math.min(getMinimumNodeDifference(root.left), getMinimumNodeDifference(root.right)));
    }
    
    public int getMinimumLondDifference(TreeNode root) {
        if(root == null) {
            return Integer.MAX_VALUE;    
        }
        int min = Integer.MAX_VALUE;
        while(root.left != null || root.right != null) {
            if(root.left != null) {
                if(min > Math.abs(root.val - root.left.val)) {
                    min = Math.abs(root.val - root.left.val);
                }
            }
            if(root.right != null) {
                
            }
        }
        return min;
    }
}

package leetcode.easy;


public class LowestCommonAncestorOfABinarySearchTree {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        
        if(root == null) {
            return root;
        }
        
       
             
        while(root != null) {
            if(isAncestor(root.left, p) && isAncestor(root.left, q)) {
                root = root.left;
            }
            else if(isAncestor(root.right, p) && isAncestor(root.right, q)) {
                root = root.right;
            }
            else {
                return root;
            }
            
        }
        
       return root;
    }
    
    public boolean isAncestor(TreeNode root, TreeNode p){
        
        if(root == null) {
            return false;
        }
        if(root.val == p.val) {
            return true;
        }
        if(root.left != null && root.right == null) {
            if(root.left.val == p.val) {
                return true;
            }
            else {
                return false;
            }
        }
        else if(root.right != null && root.left == null) {
            if(root.right.val == p.val) {
                return true;
            }
            else {
                return false;
            }
        }
        if(root.left.val == p.val || root.right.val == p.val) {
            return true;
        }
        boolean flag = false;
        flag = isAncestor(root.left, p) | isAncestor(root.right, p);
        return flag ;

        
    }
}

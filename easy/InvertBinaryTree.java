package leetcode.easy;
//#231

public class InvertBinaryTree {

    //my own solution
    public TreeNode invertTree(TreeNode root) {
        if(root == null) {
            return root;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        if(root.left != null ) {
            invertTree(root.left);
        }
        if(root.right != null) {
            invertTree(root.right);
        }
        return root;

    }
}

package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class FindModeInBinarySearchTree {

    public int[] findMode(TreeNode root) {
        traverse(root);
        
        int max = 0;
        for(int i: appearTimes.keySet()) {
            if(appearTimes.get(i) > max) {
                max = appearTimes.get(i);
            }
        }
        int count = 0;
        for(int i : appearTimes.keySet()) {
            if(appearTimes.get(i) == max) {
                count ++;
            }
        }
        count = 0;
        int[] ans = new int[count];
        for(int i : appearTimes.keySet()) {
            if(appearTimes.get(i) == max) {
                ans[count] = i;
                count ++;
            }
        }
        return ans;
        
    }
    
    Map<Integer, Integer> appearTimes = new HashMap<>();
    
    public void traverse(TreeNode root) {
        if(root == null) {
            return ;
        }
        if(!appearTimes.containsKey(root.val)) {
            appearTimes.put(root.val, 1);
        }
        else {
            appearTimes.put(root.val, appearTimes.get(root.val) + 1);
        }
        traverse(root.left);
        traverse(root.right);
    }
}

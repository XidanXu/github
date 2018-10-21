package leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
     
        int i = 0;
        int j = height.length - 1;
        int maxArea = 0;
        while(i < j) {
            if(maxArea < Math.min(height[i], height[j]) * (j - i)) {
                maxArea = Math.min(height[i], height[j]) * (j - i);
            }
            if(height[i] <= height[j]) {
                i ++;
            }
            else {
                j --;
            }
           
        }
        return maxArea;
    }
}

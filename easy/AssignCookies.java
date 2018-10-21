package leetcode.easy;

import java.util.Arrays;
// #455
public class AssignCookies{
//My solution --notice: the biscuits can not be split
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        int j = 0;
        while(i >= 0 && j >= 0) {
            if(g[i] < s[j]) {
                //s[j] = s[j] - g[i];
                i ++;
            }
            else if(g[i] == s[j]) {
                i ++;
                j ++;
            }
            else {               
                j ++;
            }

        }

        return i;
    }
    
    
}

package leetcode.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class KdiffPairsInAnArray {

    public int findPairs(int[] nums, int k) {
        Set<Integer> numsSet = new HashSet<>();
        for(int num: nums) {
            numsSet.add(num);
        }
        int[] newNums = new int[numsSet.size()];
        int t = 0;
        Iterator<Integer> iterator = numsSet.iterator();
        while(iterator.hasNext()) {
            newNums[t] = iterator.next();
            t ++;
            System.out.println(newNums[t]);
            System.out.println(t);
        }
        
        Arrays.sort(newNums);
        
        int count = 0;
        int j = 1;
        for(int i = 0; j < newNums.length; i ++) {
            while(newNums[j] - newNums[i] < k) {
                j ++;
            }
            if(newNums[j] - newNums[i] == k) {
                count ++;
            }
        }
        return count;
    }
}

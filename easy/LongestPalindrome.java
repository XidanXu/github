package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        if(s.length() == 0) {
            return 0;
        }
        Map<Character, Integer> storeCount = new HashMap<>();
        for(int i = 0 ; i < s.length(); i ++){
            if(!storeCount.containsKey(s.charAt(i))) {
                storeCount.put(s.charAt(i), 1);
            }
            else {
                storeCount.replace(s.charAt(i), storeCount.get(s.charAt(i)) + 1);
            }
        }
        int count = 0;
        System.out.println(storeCount);
        for(Character c: storeCount.keySet()) {
            if(storeCount.get(c) != 1 && count % 2 == 0) {
                count += storeCount.get(c);
            }
            if(storeCount.get(c) != 1 && count % 2 == 1) {
                count += storeCount.get(c) - 1;
            }
        }
        if(count % 2 == 0 && count <= s.length()) {
            return count + 1;
        }
        else {
            return count;
        }
    }
}

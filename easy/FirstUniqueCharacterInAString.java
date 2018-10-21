package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInAString {

    public int firstUniqChar(String s) {
        Map<Character, Integer> result = new HashMap<>();
        for(char t = 'a'; t <= 'z'; t ++){
            result.put(t, 0);
        }
        for(int i = 0; i < s.length(); i ++) {
            result.replace(s.charAt(i), result.get(s.charAt(i)) + 1);
        }
        for(int i = 0; i < s.length(); i ++) {
            if(result.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}

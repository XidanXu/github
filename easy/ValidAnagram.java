package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()){
            return false;
        }
        
        Map<Character, Integer> resultMap = new HashMap<>();
        for(int i = 0; i < s.length(); i ++) {

            if(!resultMap.containsKey(s.charAt(i))) {
                resultMap.put(s.charAt(i), 1);
            }
            else {
                resultMap.replace(s.charAt(i), resultMap.get(s.charAt(i)) + 1);
            }
    }
        for(int i = 0; i < t.length(); i ++) {
            if(resultMap.containsKey(t.charAt(i))) {
                resultMap.put(t.charAt(i), resultMap.get(t.charAt(i)) - 1);
            }
            else {
                return false;
            }
        }
        for(int i = 0; i < resultMap.size(); i ++) {
            for(char ch :resultMap.keySet()) {
                if(resultMap.get(ch) != 0) {
                    return false;
                }
            }
        }
        return true;
    }
}

package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class ExcelSheetColumnNumber {

    public int titleToNumber(String s) {
        Map<Character, Integer> resultMap = new HashMap<>();
        int result = 0;
        for(int i = 0; i < 26; i ++) {
            resultMap.put((char) ('A' + i), i);
        }
        int count = 0;
        for(int i = s.length() - 1; i >= 0 ; i --) {
            
            result += (resultMap.get(s.charAt(i)) + 1) * Math.pow(26, count);
            count ++;
        }
        return result;
        
    }
}

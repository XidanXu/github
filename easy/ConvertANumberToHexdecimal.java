package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class ConvertANumberToHexdecimal {

    public String toHex(int num) {
        Map<Integer, Character> hexMap = new HashMap<>();
        for(int i = 0; i <= 9; i ++){
            hexMap.put(i, (char) i);
        }
        for(int i = 10; i < 16; i ++){
            hexMap.put(i, (char) ('a' + i - 10));
        }
        
        StringBuffer result = new StringBuffer();
        while(num != 0){
            result.append(hexMap.get(num % 16));
            System.out.println(hexMap.get(num % 16));
            num = num / 16;
        }
        return result.reverse().toString();
    }
}

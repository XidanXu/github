package leetcode.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IntegerToRoman {

public String intToRoman(int num) {
        
        Map<Integer, String> romanValue = new HashMap<>();
        romanValue.put(1, "I");
        romanValue.put(5, "V");
        romanValue.put(10, "X");
        romanValue.put(50, "L");
        romanValue.put(100, "C");
        romanValue.put(500, "D");
        romanValue.put(1000, "M");
        
        int n = num;
        int count = 0;
        while(n / 10 != 0){
             n /= 10;
            count ++;
        }
        
        int[] judge = new int[count + 1]; 
        int i = 0;
        while(num / 10 != 0){
            judge[i ++] = (int) (num / Math.pow(10, count));
            num = (int) (num - (num / Math.pow(10, count)) * Math.pow(10, count));
            count --;
            System.out.println(num);
            
        }
        StringBuilder result = new StringBuilder();
        return result.toString();
    }
}

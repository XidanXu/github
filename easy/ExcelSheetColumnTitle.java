package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class ExcelSheetColumnTitle {

    public String convertToTitle(int n) {
         Map<Integer, Character> resultMap = new HashMap<>();

         StringBuffer result = new StringBuffer();
         for(int i = 0; i <= 25; i ++) 
         {
             resultMap.put(i, (char)('A' + i ));
         }
         while(n > 0) {
                 result.append(resultMap.get((n - 1) % 26));
                 n = (n - 1 - ((n - 1) % 26)) / 26;
         }
         return result.reverse().toString();
         
     }
}

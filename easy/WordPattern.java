package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {

    public boolean wordPattern(String pattern, String str) {
        String[] splitStrBySpace = str.split(" ");
        String[] splitPatternByNull = pattern.split("");
        if(splitStrBySpace.length != splitPatternByNull.length) {
            return false;
        }
        Map<String, String> resultMap = new HashMap<>();
        for(int i = 0; i < splitPatternByNull.length; i ++) {
            if(!resultMap.containsKey(splitPatternByNull[i])) {
                resultMap.put(splitPatternByNull[i], splitPatternByNull[i]);
                System.out.println(splitPatternByNull[i]);
            }
            else {
                if(!(resultMap.get(splitPatternByNull[i]).equals(splitPatternByNull[i]))) {
                    return false;
                }
            }
        }
        return true;
    }
}

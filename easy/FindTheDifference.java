package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class FindTheDifference {
//My own solution
    public char findTheDifference(String s, String t) {
        List<Character> result = new ArrayList<>();
        for(int i = 0; i < t.length(); i ++){
            result.add(t.charAt(i));
        }
        for(int i = 0; i < s.length(); i ++){
            if(result.contains(s.charAt(i))){
                result.remove(result.indexOf(s.charAt(i)));
            }
        }
        return result.get(0);
    }
}

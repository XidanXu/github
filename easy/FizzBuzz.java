package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<String>();
        for(int i = 0; i < n; i ++) {
            if((i + 1) % 3 == 0 && (i + 1) % 5 != 0) {
                result.add("Fizz");
                continue;
            }
            if((i + 1) % 3 != 0 && (i + 1) % 5 == 0) {
                result.add("Buzz");
                continue;
            }
            if((i + 1) % 3 == 0 && (i + 1) % 5 == 0) {
                result.add("FizzBuzz");
                continue;
            }
            else{
                result.add(i + 1 + "");
                continue;
                
            }
            
        }
        System.out.println(result);
        return result;
    }
}

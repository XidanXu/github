package leetcode.easy;

public class StringToIntegerAtoi {

    public int myAtoi(String str) {
        int result = 0;
        str = str.trim();
        if(str.charAt(0) != '-' && str.charAt(0) != '+' && !(str.charAt(0) >= '0' && str.charAt(0) <= '9')){
            return 0;
        }

        StringBuffer numString = new StringBuffer();
        
        
        for(int i = 1 ; str.charAt(i) >= '0' && str.charAt(i) <= '9' && i < str.length(); i ++) {
            numString.append(str.charAt(i));
            System.out.println(numString);
        }
        if(numString.length() == 0) {
            return 0;
        }
        
        if((str.charAt(0) >= '0' && str.charAt(0) <= '9') || str.charAt(0) == '-') {
            numString.append(str.charAt(0));
        }
        //System.out.println(numString.length());
        
        for(int i = 0 ;i < numString.length(); i ++) {
            result = result * 10 + (int) numString.charAt(i);
        }
        if(str.charAt(0) == '-') {
            result = result * (- 1);
        }
        else if(str.charAt(0) >= '0' && str.charAt(0) <= '9') {
            result = result + (int)str.charAt(0) * numString.length();
        }
        if(result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if(result < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return result;
    }
}

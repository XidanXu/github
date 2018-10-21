package leetcode.easy;

public class PowerOfTwo {

    public boolean isPowerOfTwo(int n) {
        if(n <= 0) {
            return false;
        }
        String result = Integer.toBinaryString(n);
        for(int i = 1; i < result.length() ; i ++) {
            if(result.charAt(i) == '1') {
                return false;
            }
        }
        return true;
    }
}

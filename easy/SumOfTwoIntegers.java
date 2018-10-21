package leetcode.easy;

public class SumOfTwoIntegers {

    public int getSum(int a, int b) {
        
        String binaryOfa = Integer.toBinaryString(a);
        String binaryOfb = Integer.toBinaryString(b);
        
        int length = Math.max(binaryOfa.length(), binaryOfb.length());
        if(binaryOfa.length() >= binaryOfb.length()){
            for(int i = 0; i < binaryOfa.length() - binaryOfb.length(); i ++) {
                binaryOfb = "0" + binaryOfb;
            }
        }
        if(binaryOfa.length() < binaryOfb.length()){
            for(int i = 0; i < binaryOfb.length() - binaryOfa.length(); i ++) {
                binaryOfa = "0" + binaryOfa;
            }
        }
        String result = new String();
        for(int i = binaryOfa.length(); i >= 0; i --) {
            if(binaryOfa.charAt(i) == '1' && binaryOfb.charAt(i) == '1' && i == 0) {
                result = "1" + result;
            }
            if(binaryOfa.charAt(i) != binaryOfb.charAt(i)) {
                result = result + "1";
            }
            if(binaryOfa.charAt(i) == binaryOfb.charAt(i) && binaryOfa.charAt(i) == '0') {
                result = result + "0";
            }
            
        }
        return length;
    }
    
    
}

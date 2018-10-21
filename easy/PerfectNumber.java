package leetcode.easy;

public class PerfectNumber {
    public boolean checkPerfectNumber(int num) {
        int sub = num - 1;
        if(num == 2) {
            return false;
        }
        for(int i = 2;i < num / 2; i ++) {
            if(num % i == 0) {
                sub = sub - i - sub / i;
            }
                
        }
        if(sub == 0) {
            return true;
        }
        else {
            return false;
        }
        
    }
}

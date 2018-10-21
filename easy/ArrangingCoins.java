package leetcode.easy;

public class ArrangingCoins {
    public int arrangeCoins(int n) {
        int count = 1;
        for(int i = 1; n - i > count ; i ++) {
            count ++;
            n = n - i;
        }
        return count;
    }
}

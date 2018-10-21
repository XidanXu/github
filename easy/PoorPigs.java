package leetcode.easy;

public class PoorPigs {

    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int i = 0;
        int pigNum = 0;
        while(Math.pow((minutesToTest / minutesToDie) + 1, pigNum) < buckets){
            pigNum ++;
        }
        return pigNum;
    }
}

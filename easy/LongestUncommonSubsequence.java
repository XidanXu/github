package leetcode.easy;

public class LongestUncommonSubsequence {

    public int findLUSlength(String a, String b) {
        if(a.length() > b.length()) {
            return a.length();
        }
        if(b.length() > a.length()) {
            return b.length();
        }
        else {
            if(a.equals(b)) {
                return -1;
            }
            else {
                return a.length();
            }
        }
    }
}

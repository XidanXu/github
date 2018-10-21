package leetcode.medium;

public class strStrUsingKMP {

    public int strStr2(String source, String target) {
        if(source == null || target == null){
            return -1;
        }
        if(target.length() == 0){
            return 0;
        }
        int[] lps = new int[target.length()];
        makeLPS(target, lps);
        int i = 0;
        int j = 0;
        
        while(i < source.length()){
            if(source.charAt(i) == target.charAt(j)){
                i ++;
                j ++;
                
            }
            if(j == target.length()){
                //j = lps[j - 1];
                return i - j;
            }
            else if(i < source.length() && source.charAt(i) != target.charAt(j)){
                if(j != 0){
                    j = lps[j - 1];
                }else{
                    i ++;
                }
            }
        }
        return -1;
        
    }
    
    public void makeLPS(String target, int[] lps){
        int len = 0;
        lps[0] = 0;
        int i = 1;
        while(i < target.length()){
            if(target.charAt(len) == target.charAt(0)){
                len ++;
                lps[i] = len;
                i ++;
            }
            else{
                if(len != 0){
                    len = lps[len - 1];
                }
                else{
                    lps[i] = len;
                    i ++;
                }
            }
        }
    }
}

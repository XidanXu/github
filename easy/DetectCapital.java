package leetcode.easy;

public class DetectCapital {

    public boolean detectCapitalUse(String word) {
        word = word.trim();
        if(word.charAt(0) >= 'a' && word.charAt(0) <= 'z') {
            for(int i = 1;i < word.length(); i ++) {
                if(word.charAt(i) == ' ' || (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z')) {
                    return false;
                }
            }
        }
        else {
            boolean space = false;
            int capital = 0;
            for(int i = 1 ; i < word.length(); i ++) {
                if(word.charAt(i) == ' ') {
                    space = true;
                }
                if(word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
                    capital ++;
                }
                if(space == true && capital != 0) {
                    return false;
                }
                if(space == false && capital != word.length()) {
                    return false;
                }
                
            }
            
        }
        return true;  
    }
}

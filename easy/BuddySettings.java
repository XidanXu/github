package leetcode.easy;

public class BuddySettings {

    public boolean buddyStrings(String A, String B) {
        if(A.length() != B.length()){
            return false;
        }
        if(A.length() == 0 || A.length() == 1){
            return false;
        }
        if(A.length() == 2) {
            if(A.charAt(0) == B.charAt(1) && A.charAt(1) == B.charAt(0)) {
                return true;
            }
            else {
                return false;
            }
        }
        int count = 0;
        for(int i = 0; i < A.length(); i ++) {
            if(A.charAt(i) != B.charAt(i)) {
                count ++;
            }
        }
        if(count == 2) {
            int j = A.length() - 1;
            int k = 0;
            char diffAT = 'A';
            char diffBT = 'B';
            char diffAO = 'C';
            char diffBO = 'D';
            for(int i = 0; i < A.length(); i ++) {
                
                while(j > i) {
                    if(A.charAt(j) != B.charAt(j)) {
                        diffAT = A.charAt(j);
                        diffBT = B.charAt(j);
                        j = 0;
                    }
                    j --;
                }
                if(A.charAt(i) != B.charAt(i)) {
                    diffAO = A.charAt(i);
                    diffBO = B.charAt(i);
                    i = A.length();
                        
                }
                    
            }
            if(diffAO == diffBT && diffAT == diffBT) {
                
                return true;
            }
            else {
                return false;
            }
        }
            
        else {
            return false;
        }
        //return false;
    }
}

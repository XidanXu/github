package leetcode.easy;

import javax.print.DocFlavor.STRING;

public class isPalindrome {
    //own solution
    public boolean isPalindrome(String s) {
        int i = 0;
        int k = s.length() - 1;
        String sl = s.toLowerCase();
        if(i + 1 == k) {
            if((sl.charAt(i) >= 'a' && sl.charAt(k) <= 'z')||(s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
                if(sl.charAt(k) >= 'a' && sl.charAt(k) <= 'z'||(s.charAt(k) >= '0' && s.charAt(k) <= '9')) {
                       if(sl.charAt(i) == sl.charAt(k)) {
                           return true;
                       }
                       else {
                           return false;
                       }
                }
            }
            else {
                return true;
            }
        }
        while(i < k) {
            if(sl.charAt(i) >= 'a' && sl.charAt(k) <= 'z'||(s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
                if(sl.charAt(k) >= 'a' && sl.charAt(k) <= 'z'||(s.charAt(k) >= '0' && s.charAt(k) <= '9')) {
                    if(sl.charAt(i) == sl.charAt(k)) {
                        i ++;
                        k --;
                    }
                    else {
                        return false;
                    }
                }
                else {
                    k --;
                }
            }
            else {
                i ++;
            }
        }
        return true;
    }
    
//    public boolean isPalindrome(String s) {
//
//        String finished = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
//        return finished.equals(new StringBuffer(finished).reverse().toString()) ? true : false;
//    }
}

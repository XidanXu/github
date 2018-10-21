package leetcode.easy;

import java.util.HashMap;

class Solution {
    public int solution(String[] L) {
        if(L.length == 0 || L == null) {
            return 0;
        }
        HashMap<String, Integer> hashResult = new HashMap<>();
        int result = 0;
        String[] newL = new String[L.length];
        
        for(int i = 0; i < L.length; i ++) {
            String emailAddr = new String();
            emailAddr = processLocal(L[i]) + getDomain(L[i]);
            if(!hashResult.containsKey(emailAddr)) {
                hashResult.put(emailAddr, 1);
            }
            else if(hashResult.containsKey(emailAddr)) {
                hashResult.put(emailAddr, hashResult.get(emailAddr) + 1);
            }
            
        }

        for(int i:hashResult.values()) {
            if(i > 1) {
                result ++;
            }
        }
        return result;
        // write your code in Java SE 8
    }
    
    public String processLocal(String local) {
        String result = new String();
        
        for(int i = 0; local.charAt(i) != '@'; i ++) {
            if(local.charAt(i) != '.') {
                result += local.charAt(i);
            }
            if(local.charAt(i) == '+') {
                break;
            }
        }
        return result;
    }
    
    public String getDomain(String local) {
        String domain = new String();
        boolean flag = false;
        for(int i = 0; i < local.length(); i ++) {
            if(local.charAt(i) == '@') {
                flag = true;
                //continue;
            }
            if(flag == true) {
                domain += local.charAt(i);
            }
        }
        return domain;
    }
}
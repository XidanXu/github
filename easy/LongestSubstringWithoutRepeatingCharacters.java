package leetcode.easy;


import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    //Time limit exceeded method
//    public static int lengthOfLongestSubstring(String s) {
//        Set<Character> result = new HashSet<>();
//        int finalMax = 0;
//        int max = 0;
//        for(int i = 0; i < s.length() ; i ++) {
//            
//            if(result.contains(s.charAt(i))) {
//                for(int j = i - 1 ; j >= 0 ; j --) {
//                    if(s.charAt(j) == s.charAt(i)) {
//                        i = j + 1;
//                        break;
//                        //System.out.println(i);
//                    }
//                }
//                max = 1;
//                result = new HashSet<>();
//                
//                result.add(s.charAt(i));
//                System.out.println(result);
//            }
//            
//            else {
//                result.add(s.charAt(i));
//                System.out.println(result);
//                max ++;
//            }
//            if(max > finalMax) {
//                finalMax = max;
//            }
//        }
//        return finalMax;
//        
//    }
    
    //not finished
    public static int lengthOfLongestSubstring(String s) {
        int mid = (s.length() - 1) / 2;
        int leftMax = leftLength(s, 0, mid);
        int rightMax = rightLength(s, mid + 1, s.length());
        int midMax = midLength(s, 0, s.length());
        return midMax;
        
        
        
    }
    
    public static int leftLength(String s, int low, int high) {
        int mid = low + (high - low) / 2;
        Set<Character> result = new HashSet<>();
        int finalMax = 0;
        int max = 0;
        for(int i = low; i <= mid ; i ++) {
            
            if(result.contains(s.charAt(i))) {
                for(int j = i - 1 ; j >= 0 ; j --) {
                    if(s.charAt(j) == s.charAt(i)) {
                        i = j + 1;
                        break;
                    }
                }
                max = 1;
                result = new HashSet<>();
                
                result.add(s.charAt(i));
            }
            
            else {
                result.add(s.charAt(i));
                max ++;
            }
            if(max > finalMax) {
                finalMax = max;
            }
        }
        return finalMax;
        
    }
    
    public static int rightLength(String s, int low, int high) {
        int mid = low + (high - low) / 2;
        Set<Character> result = new HashSet<>();
        int finalMax = 0;
        int max = 0;
        for(int i = mid + 1; i < high ; i ++) {
            
            if(result.contains(s.charAt(i))) {
                for(int j = i - 1 ; j >= 0 ; j --) {
                    if(s.charAt(j) == s.charAt(i)) {
                        i = j + 1;
                        break;
                    }
                }
                max = 1;
                result = new HashSet<>();
                
                result.add(s.charAt(i));
            }
            
            else {
                 
                result.add(s.charAt(i));
                max ++;
            }
            if(max > finalMax) {
                finalMax = max;
            }
        }
        return finalMax;
        
    }
    
    public static int midLength(String s, int low, int high) {
        int mid = low + (high - low) / 2;
        Set<Character> result = new HashSet<>();
        int finalMax = 0;
        int max = 0;
        int i = mid;
        int k = mid + 1;
        for(i = mid, k = mid + 1; i >= low ; i --, k ++) {
            if(s.charAt(i) == s.charAt(k)) {
                return finalMax;
            }
        }
        return k;
    }
    
    
}

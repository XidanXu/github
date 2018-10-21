//package leetcode.easy;
//
//public class LongestPalinromicSubstring {
//    public String longestPalindrome(String s) {
//        if(s == null || s.length() == 0){
//            return null;
//        }
//        if(s.length() == 1){
//            return s;
//        }
//        s = s.toLowerCase();
//        String result = new String();
//        
//        
//        for(int i = 0; i < s.length() ; i ++) {
//            String temp = new String();
//            for(int j = s.length() - 1; j > i ; j --) {
//                boolean flag = true;
//                if(s.charAt((int) i) == s.charAt((int) j)) {
//                    int il = i + 1;
//                    int jr = j - 1;
//                    while(il <= jr) {
//                        if(flag == false) {
//                            break;
//                        }
//                        if(s.charAt(il) != s.charAt(jr)) {
//                            flag = false;
//                        }
//                        il ++;
//                        jr --;
//                    }
//                    if(flag == false) {
//                        break;
//                    }
//                    else {
//                        temp = s.substring(i, j + 1);
//                        //System.out.println(temp);
//                    }
//                }
//                if((result.length() <= temp.length())) {
//                    result = temp;
//                    //System.out.println(result);
//                }
//            }           
//        }
//        
//        for(int j = s.length() - 1; j >= 0 ; j --) {
//            String temp = new String();
//            for(int i = 0; i < j ; i ++) {
//                boolean flag = true;
//                if(s.charAt(i) == s.charAt(j)) {
//                    int il = i + 1;
//                    int jr = j - 1;
//                    while(il <= jr) {
//                        if(flag == false) {
//                            break;
//                        }
//                        if(s.charAt(il) != s.charAt(jr)) {
//                            flag = false;
//                        }
//                        il ++;
//                        jr --;
//                    }
//                    if(flag == false) {
//                        break;
//                    }
//                    else {
//                        temp = s.substring(i, j + 1);
//                        //System.out.println(temp);
//                    }
//                }
//                if((result.length() <= temp.length())) {
//                    result = temp;
//                    //System.out.println(result);
//                }
//            }
//            
//            
//        }
//        if(result.length() == 0){
//                return s.substring(0,1);
//            }
//        return result;
//        
//    }
//}

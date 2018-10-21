package leetcode.easy;



public class RepeatedSubstringPattern {
    
    public boolean repeatedSubstringPattern(String str) {
        int l = str.length();
        for(int i=l/2;i>=1;i--) {
            if(l%i==0) {
                int m = l/i;
                String subS = str.substring(0,i);
                StringBuilder sb = new StringBuilder();
                for(int j=0;j<m;j++) {
                    sb.append(subS);
                }
                if(sb.toString().equals(str)) return true;
            }
        }
        return false;
    }
    
//    public boolean repeatedSubstringPattern(String s) {
//        String pattern = new String();
//        int i = 1;
//        while(i < s.length()){
//            if(s.charAt(0) == s.charAt(i)) {
//                pattern = s.substring(0,  i);
//                if(pattern.equals(s.substring(i, i + pattern.length()))) {
//                    int temp = i;
//                    temp = i + pattern.length();
//                }
//            }
//        }
//        return false;
//    }
    //wrong if situation "abaababaab"
//    public boolean repeatedSubstringPattern(String s) {
//        String pattern = new String();
//        int count = 1;
//         boolean flag = false;
//        int j = 1;
//        while(j < s.length()) {
//            if(s.charAt(0) == s.charAt(j)) {
//                if(flag == false){
//                 pattern = s.substring(0, j);
//                    System.out.println(pattern);
//                }
//                System.out.println(pattern);
//                if(j + pattern.length() > s.length()) {
//                    System.out.println("j:"+j);
//                    return false;
//                }
//                else {
//                    if(pattern.equals(s.substring(j, j + pattern.length()))){
//                        System.out.println(s.substring(j, j + pattern.length()));
//                        flag = true;
//                        count ++;
//
//                    }
//                    else {
//                        flag = false;
//
//                    }
//                }
//            }
//
//            j ++;
//        }
//          System.out.println(s.length());
//          System.out.println(pattern.length());
//          System.out.println(count);
//        if(s.length() / count == pattern.length() && s.length() % count == 0) {
//            return true;
//        }
//        else {
//            return false;
//        }
//        
//     }
    
}

package leetcode.easy;

public class ValidPalindromeII {

    //own solution
//    public boolean validPalindrome(String s) {
//        int j = s.length() - 1;
//        int count = 0;
//        if(s.length() == 3){
//            if(s.charAt(0) != s.charAt(s.length() - 1)){
//                return false;
//            }
//            else{
//                return true;
//            }  
//        }
//        if(s.length() == 2){
//            return true;
//        }
//        boolean flag = false;
//        int i;
//
//        for(i = 0; i <= j; i ++) {
//            if(s.charAt(i) != s.charAt(j) && count == 0) {
//                count ++;
//                j --;
//            }
//            if(s.charAt(i) != s.charAt(j)) {
//                count ++;
//                flag = false;
//            }
//            j--;
//        }
//        if(i >= j && count <= 1){
//            
//            flag = true;
//        }
//        if(flag == true){
//            return true;
//        }
//        i = 0;
//        count = 0;
//        for(j = s.length() - 1; i <= j; j --) {
//            if(s.charAt(i) != s.charAt(j) && count == 0) {
//                count ++;
//                i ++;
//            }
//            if(s.charAt(i) != s.charAt(j)) {
//                count ++;
//                flag = false;
//            }
//            i ++;
//        }
//        if(i >= j && count <= 1){
//            System.out.println(flag);
//            flag = true;
//        }
//
//        return flag;
//    }
    
    public boolean validPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }
        int i = 0, j = s.length() - 1;
        char[] arr = s.toCharArray();
        
        while (i < j) {
            if (arr[i] != arr[j]) {
                return helper(arr, i + 1, j) || helper(arr, i, j - 1);
            }
            i++;
            j--;
        }
        return true;
    }
    private boolean helper(char[] arr, int i, int j) {
        while (i < j) {
            if (arr[i] != arr[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

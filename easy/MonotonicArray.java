package leetcode.easy;

import java.util.Arrays;

public class MonotonicArray {
    
    public boolean isMonotonic(int[] A) {
        return increasing(A) || decreasing(A);
    }

    public boolean increasing(int[] A) {
        for (int i = 0; i < A.length - 1; ++i)
            if (A[i] > A[i+1]) return false;
        return true;
    }

    public boolean decreasing(int[] A) {
        for (int i = 0; i < A.length - 1; ++i)
            if (A[i] < A[i+1]) return false;
        return true;
    }
//    public boolean isMonotonic(int[] A) {  
//        
//        if(A.length == 0 || A == null) {
//            return true;
//        }
//        int[] newA = new int[A.length];
//        for(int i = 0; i < A.length; i ++) {
//            newA[i] = A[i];
//        }
//        Arrays.sort(A);
//
//
//        int t = 0;
//        for(t = 0; t < A.length; t ++){
//            if(A[t] != newA[t]){
//                break;
//            }
//        }
//        if(t == A.length){
//            return true;
//        }
//
//        
//        int j = A.length - 1;
//        
//        for(int i = 0; i < A.length; i ++) {
//            if(A[i] != newA[j]) {
//                return false;
//            }
//            else{
//                j --;
//            }
//        }
//        return true;
//    }
}

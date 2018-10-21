package leetcode.easy;

public class FairCandySwap {

    public int[] fairCandySwap(int[] A, int[] B) {
        int sumA = 0;
        int sumB = 0;
        for(int i = 0; i < A.length; i ++){
            sumA = sumA + A[i];
        }
        for(int i = 0; i < B.length; i ++){
            sumB = sumB + B[i];
        }
        int diff = sumA - (sumA + sumB) / 2;
        
        for(int i = 0; i < A.length; i ++) {
            for(int j = 0; j < B.length; j ++) {
                if(A[i] - diff == B[j]) {
                    return new int[] {A[i], B[j]};
                }
            }
        }
        return null;
    }
}

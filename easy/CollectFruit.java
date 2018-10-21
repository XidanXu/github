package leetcode.easy;

public class CollectFruit {
    public int solution(int[] A) {
        if(A.length == 0 || A == null) {
            return 0;
        }
        if(A.length == 1){
            return 1;
        }
        int i = 0;
        int j = 1;
        int result = 2;
        int max = 2;
        while(j < A.length) {         
            for(int k = j + 1; k < A.length ; k ++) {
                if(A[k] == A[i] || A[k] == A[j]) {
                    result ++;
                    
                    continue;
                }
                else {
                    if(max < result) {
                        max = result;
                    }
                    i ++;
                    j ++;
                    result = 2;
                    break;
                }             
            }            
        }
        return 0;
        // write your code in Java SE 8
        
    }
}

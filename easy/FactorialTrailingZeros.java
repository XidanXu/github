package leetcode.easy;

public class FactorialTrailingZeros {
    
    public int trailingZeros(int n) {
        int count = 0;
        while(n >= 5) {
            count += n / 5;
            n = n / 5;
        }
        return count;
    }
    //Time limit exceeded 
//    public int trailingZeroes(int n) {
//        int countF = 0;
//    
//        for(int i = n ; i >= 5; ) {
//            int num = i;
//            if(i % 5 == 0){
//                
//                while(num % 5 == 0){
//                    countF ++;
//                    num = num / 5;                   
//                }
//                i = i - 5;
//            }
//            else{
//                i --;
//            }            
//        }
//        return countF;
//    }
}

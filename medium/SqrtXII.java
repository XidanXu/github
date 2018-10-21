package leetcode.medium;

public class SqrtXII {

    public class Solution {
        /*
         * @param x: a double
         * @return: the square root of x
         */
        public double sqrt(double x) {
            // write your code here
            if(x >= 1){
                long start = 0;
            long end = (long) x / 2;
            
            while(start + 1 < end){
                long mid = start + (end - start) / 2;
                if(mid * mid == x){
                    return mid;
                }
                else if(mid * mid < x){
                    start = mid;
                }
                else if(mid * mid > x){
                    end = mid;
                }
            }
            double resStart;
            double resEnd;
            if(end * end <= x){
                resStart = end;
                resEnd = end + 1;
            }
            else{
                resStart = start;
                resEnd = end;
            }
            System.out.println(resStart);
          
            System.out.println(resEnd);
            
            while(resStart + 0.000000001 < resEnd){
                double mid = resStart + (resEnd - resStart) / 2;
                System.out.println(mid);
                if(mid * mid == x){
                    return mid;
                }
                else if(mid * mid < x){
                    resStart = mid;
                }
                else if(mid * mid > x){
                    resEnd = mid;
                }
            }
            if(resEnd * resEnd <= x){
                
                return resEnd;
            }
            return resStart;
            }
            
            else{
                
            }

            double resStart = 0;
            double resEnd = 1;


            System.out.println(resStart);
            System.out.println(resEnd);
            
            while(resStart + 0.0000000001 < resEnd){
                double mid = resStart + (resEnd - resStart) / 2;
                System.out.println(mid);
                if(mid * mid == x){
                    return mid;
                }
                else if(mid * mid < x){
                    resStart = mid;
                }
                else if(mid * mid > x){
                    resEnd = mid;
                }
            }
            if(resStart * resStart > x){
                return resStart;
            }

            return resEnd;
        }
    }
}

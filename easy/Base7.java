package leetcode.easy;

public class Base7 {

    public String convertToBase7(int num) {
        StringBuffer result = new StringBuffer();
        boolean flag = false;
        if(num < 0) {
            flag = true;
        }
        num = Math.abs(num);
        while(num / 7 != 0){           
            result.append(num % 7);
            num = num / 7;
        }
        result.append(num % 7);
        if(flag == false) {
            return result.reverse().toString();
        }
        else {
            result.append("-");
            return result.reverse().toString();
        }
    }
    
}

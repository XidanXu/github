package leetcode.easy;

public class NumberComplement {

	//the sum is 111111, so just find this num and use it to substract num
	public int findComplement(int num) 
    {
        int i = 0;
        int j = 0;
        
        while (i < num)
        {
            i += Math.pow(2, j);
            j++;
        }
        
        return i - num;
    }
	
	//My own solution
//	public int findComplement(int num) {
//        String numBit = new String();
//        String reverse = new String();
//        numBit = Integer.toBinaryString(num);
//        boolean flag = false;
//        for(int i = 0; i < numBit.length(); i ++){
//            if(numBit.charAt(i) == '0') {
//            		 reverse.concat("1");
//            		 flag = true;
//            }
//            if(flag == true) {
//            		if(numBit.charAt(i) == '1') {
//            			reverse.concat("0");
//            		}
//            }
//        }
//        int returnNum = 0;
//        for(int i = reverse.length() - 1; i >= 0; i --) {
//        		if(reverse.charAt(i) == 1) {
//        			returnNum += Math.pow(2, reverse.length() - i - 1);
//        		}
//        		
//        }
//        return returnNum;
//    }
}

package leetcode.medium;

public class LongestUncommonSubsequenceII {

    
    public static void main(String[] args) {
        //System.out.println(isSubsequence("abatbab","bab"));
        String a = new String("abatbab");
        String b = new String("bab");
        System.out.println(b.indexOf(a));
    }
    public static boolean isSubsequence(String a, String b){
        int i=0, j=0;
        while(i<a.length() && j<b.length()) if (a.charAt(i)==b.charAt(j++)) i++;
        return i==a.length();
    }
    
    public int findLUSlength(String[] strs) {
        if(strs == null){
            return -1;
        }
        // if(strs.length == 1){
        //     return strs[0].length();
        // }
        int maxLength = -1;
        for(int i = 0; i < strs.length; i ++){
            for(int j = strs.length - 1; j > i; j --){
                if(strs[j].length() > strs[j - 1].length()){
                    String temp = new String();

                    temp = strs[j];
                    strs[j] = strs[j - 1];
                    strs[j - 1] = temp;
              
                }
            }
        }
        
        for(int i = 0; i < strs.length; i ++){
            System.out.println(strs[i]);
        }
        StringBuilder[] result = new StringBuilder[3];
        
        
        int count = 1;
        for(int i = 1; i < strs.length; i ++){
            if(strs[0].length() == strs[i].length()){
                count ++;
            }
            else{
                break;
            }
        }
        if(count == 1){
            return strs[0].length();
        }
     
        String[] result1s= new String[count];
        
        return -1;
    }
}

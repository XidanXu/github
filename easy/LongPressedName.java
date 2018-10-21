package leetcode.easy;

public class LongPressedName {
    // #925
    // weekly contest 10/20/2018
    public boolean isLongPressedName(String name, String typed) {
        if(name.length() > typed.length()){
            return false;
        }
        int i = 0;
        int ii = 0;
        int j = 0;
        int jj = 0;
        while(i < name.length() && ii < typed.length()){
            if(name.charAt(i) != typed.charAt(ii)){              
                return false;
            }
            
            for(j = i + 1; j < name.length(); j ++){
                if(name.charAt(i) != name.charAt(j)){
                    break;
                }
            }
            
            for(jj = ii + 1; jj < typed.length(); jj ++){
                if(typed.charAt(ii) != typed.charAt(jj)){
                    break;
                }
            }
            String subName = name.substring(i, j);
             System.out.println("name: " + subName);
            String subTyped = typed.substring(ii, jj);
            System.out.println("typed: " + subTyped);
            if(!subTyped.contains(subName)){
                System.out.println("false");
                return false;
            }
            i = j;
            System.out.println("j:" + j);
            System.out.println("jj:" + jj);
            ii = jj;
            
        }
        if(ii == typed.length() && i != name.length()){
            return false;
        }
        return true;
    }
}

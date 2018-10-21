package leetcode.easy;

//import java.util.HashMap;
//import java.util.Map;

public class StringCompression {
    
    public int compress(char[] chars) {
        int fast = 1;
        int count = 1;
        boolean flag = false;
        int slow = 0;
        for(slow = 0; fast < chars.length; slow ++) {
            while(chars[fast - 1] == chars[fast]) {
                fast ++;
                count ++;
                flag = true;
                continue;
            }
            if(flag == true) {
                while(count / 10 != 0) {
                    chars[slow ++] = Character.forDigit(count / (int)(Math.pow(10, Math.log10(count))), 10);
                    count = (int)(count - Math.pow(10, Math.log10(count)) * (count /(int)(Math.pow(10, Math.log10(count)))));
            }
                chars[slow] = Character.forDigit(count % 10, 10);
                flag = false;
        }
            if(fast == slow) {
                fast ++;
            }
        }
        return slow;
    }
}
//wrong understanding
//    public int compress(char[] chars) {
//        Map<Character, Integer> store = new HashMap<>();
//        for(int i = 35; i <= 126; i ++) {
//            store.put((char)i, 0);
//            //System.out.println(store.keySet());
//        }
//        for(int i = 0 ; i < chars.length; i ++) {
//            store.replace(chars[i], store.get(chars[i]) + 1);
//            //System.out.println(chars[i]);
//        }
//        int result = 0;
//        int fast = 0;
//        boolean flag = false;
//        
//        for(int i = 35; i <= 126; i ++) {
//           
//            
//            if(store.get((char)i) != 0 && store.get((char)i) != 1) {
//                result ++;
//                result += (int) Math.log10(store.get((char)i)) + 1;
//                
//            }
//            if(store.get((char)i) == 1){
//                result ++;
//            }
//
//        }
//        //System.out.println(result);
//        for(int slow = 0; slow < result  ; slow ++) {          
//            if(flag == true){
//                char temp = chars[slow];
//                
//                while(store.get(temp) / 10 != 0) {
//                    chars[slow] = Character.forDigit((int) (store.get(temp) / Math.pow(10, (int) Math.log10(store.get(temp)))), 10) ; 
//
//
//                    store.replace(temp, (int) (store.get(temp) - Math.pow(10, (int) Math.log10(store.get(temp))) * (chars[slow] - 48)));
//                    
//                    slow ++;
//                   
//                }
//                
//                flag = false;
//                chars[slow] = Character.forDigit(store.get(temp) % 10, 10);
//
//            }
//
//            
//            System.out.println("slow:"+slow+ ":" + chars[slow]);
//            
//            if(flag == false){
//                 
//                if(store.get(chars[slow]) != 0 && store.get(chars[slow]) != 1) {
//if(fast < chars.length && slow + 1 < chars.length)
//                 chars[slow + 1] = chars[fast];
//
//                    System.out.println(slow);
//                    fast += (int) store.get(chars[slow]) ;
//
//                    flag = true;
//                }
//                if(store.get(chars[slow]) == 1){
//                    fast ++;
//                }
//            }
//        }
//      
//        return result;
//    }


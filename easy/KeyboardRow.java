package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class KeyboardRow {

	public String[] findWords(String[] words) {
       
		Map<Character, Integer> wordMap = new HashMap<>();
		for(char i = 'a'; i <= 'z'; i ++) {
			if(i == 'q' || i =='w' || i =='e' || i =='r' || i =='t' || i =='y' || i =='u' || i =='i' || i =='o' || i =='p') {
				wordMap.put(i, 1);
			}
			else if(i =='a' || i =='s'|| i =='d'|| i =='f'|| i =='g'|| i =='h'|| i =='j'|| i =='k'|| i =='l') {
				wordMap.put(i, 2);
			}
			else {
				wordMap.put(i, 3);
			}
		}
		return words;
		
       
    }
}

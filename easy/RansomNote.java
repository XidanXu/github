package leetcode.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class RansomNote {

    public static boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()) {
            return false;
        }
        List<Character> ransomNoteList = new ArrayList<>();
        for(int i = 0; i < ransomNote.length(); i ++) {
            ransomNoteList.add(ransomNote.charAt(i));
        }
        //StringBuffer ransomNoteBuffer = new StringBuffer();
        //ransomNoteBuffer.append(ransomNote);
        for(int i = 0; i < magazine.length(); i ++) {
           
            if(ransomNoteList.contains(magazine.charAt(i))) {
                if(!ransomNoteList.isEmpty()) {
                    ransomNoteList.remove(ransomNoteList.indexOf(magazine.charAt(i)));
                }
            }
        }
        if(ransomNoteList.size() == 0) {
            return true;
        }
        else {
            return false;
        }
    }
    
    
}

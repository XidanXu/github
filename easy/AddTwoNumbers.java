package leetcode.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        findLongerNode(l1, l2);
        ListNode result = new ListNode(0);
        ListNode returnResult = result;
        
        while(l1.next != null) {
            if(l1.val + l2.val <= 9) {
                result.next = new ListNode(l1.val + l2.val);
                result = result.next;
                l1 = l1.next;
                l2 = l2.next;
            }
            else {
                result.next = new ListNode((l1.val + l2.val) % 10);
                l1 = l1.next;
                l2 = l2.next;
                l2.val = l2.val + 1;
                result = result.next;
            }

        }
        if(l1.val + l2.val <= 9) {
            result.next = new ListNode(l1.val + l2.val);
        }
        else {
            result.next = new ListNode((l1.val + l2.val) % 10);
            result = result.next;
            result.next = new ListNode(1);
            
            
        }
        return returnResult.next;
        
    }
    public static void findLongerNode(ListNode l1, ListNode l2) {

        while(l1.next != null) {
            if(l2.next == null) {
                l2.next = new ListNode(0);
                l2 = l2.next;
                l1 = l1.next;
            }
            else {
                l2 = l2.next;
                l1 = l1.next;
            }
            
        }
        while(l2.next != null) {
            l1.next = new ListNode(0);
            l1 = l1.next;
            l2 = l2.next;
        }

        
        
    }
    
    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
          return new int[0];
        }
    
        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }
    
    public static ListNode stringToListNode(String input) {
        // Generate array from the input
        int[] nodeValues = stringToIntegerArray(input);
    
        // Now convert that list into linked list
        ListNode dummyRoot = new ListNode(0);
        ListNode ptr = dummyRoot;
        for(int item : nodeValues) {
            ptr.next = new ListNode(item);
            ptr = ptr.next;
        }
        return dummyRoot.next;
    }
    
    public static String listNodeToString(ListNode node) {
        if (node == null) {
            return "[]";
        }
    
        String result = "";
        while (node != null) {
            result += Integer.toString(node.val) + ", ";
            node = node.next;
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            ListNode l1 = stringToListNode(line);
            line = in.readLine();
            ListNode l2 = stringToListNode(line);
            
            ListNode ret = addTwoNumbers(l1, l2);
            
            String out = listNodeToString(ret);
            
            System.out.print(out);
        }
    }
}

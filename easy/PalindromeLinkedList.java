package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {
        if(head == null) {
            return true;
        }
        ListNode reverse = reverseList(head);
        System.out.println("reverse val:" + reverse.val);
        System.out.println("reverse next val:" + reverse.next.val);
        ListNode p = reverse;
        List<Integer> revA = new ArrayList<>();
        while(p.next != null) {
            revA.add(p.val);
            p = p.next;
        }
        revA.add(p.val);
        reverse = reverseList(reverse);
        System.out.println("reverse val:" + reverse.val);
        System.out.println("reverse next val:" + reverse.next.val);
        List<Integer> revB = new ArrayList<>();
        p = reverse;
        while(p.next != null) {
            revB.add(p.val);
            p = p.next;
        }
        revB.add(p.val);
        
        if(revA.equals(revB)) {
            return true;
        }
        else {
            return false;
        }
    }

//        System.out.println("reverse val:" + reverse.val);
//        System.out.println("head val:" + head.val);
//        System.out.println(reverse.next.val);
//        if(reverse.val != head.val) {
//            return false;
//        }
//        while(reverse.next != null && reverse.next.val != Integer.MAX_VALUE) {
//            reverse = reverse.next;
//            head = head.next;
//            
//            
//            if(reverse.val != head.val) {
//                return false;
//            }
//        }

    
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        
        a.next = b;
        b.next = c;
        c.next = d;
        
        
        System.out.println(reverseList(a).next.next.next.val);    
    }
    
    public static ListNode reverseList(ListNode head) {
        if(head == null) {
            return head;
        }
        ListNode prev = head;
        ListNode cur = new ListNode(0);
        ListNode ne = new ListNode(0);
        if(prev.next != null) {
           cur = prev.next;
           prev.next = null;
        }
        else {
            return head;
        }
        if(cur.next != null) {
            ne = cur.next;
        }
        else {
            cur.next = prev;
            prev.next = null;
            return cur;
        }
        
        while(ne.next != null) {
            cur.next = prev;
            prev = cur;
            cur = ne;
            ne = ne.next;
        }
        cur.next = prev;
        //prev.next = new ListNode(Integer.MAX_VALUE);
        prev = cur;
        cur = ne;
        cur.next = prev;
        return cur;
    }
}

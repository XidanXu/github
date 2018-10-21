package leetcode.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class IntersectionOfTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        List reverseHeadA = new ArrayList();
        
        ListNode prev = headA;
        ListNode curr = headA.next;
        while(curr.next != null) {
            curr = curr.next;
            
        }
        return headB;
        
    }
    
    
}

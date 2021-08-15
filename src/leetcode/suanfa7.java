package leetcode;

import ieheima.interview.ListNode;


import java.util.HashSet;
import java.util.Set;

/*
https://leetcode-cn.com/problems/linked-list-cycle/solution/huan-xing-lian-biao-by-leetcode-solution/

 */
public class suanfa7 {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> seen = new HashSet<ListNode>() ;
        while(head != null){
            if(!seen.add(head)){
                return true;
                }
            //head = head.next();
            }
        return false;
        }

    }


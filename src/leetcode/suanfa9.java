package leetcode;
/*
https://leetcode-cn.com/problems/merge-two-sorted-lists/solution/he-bing-liang-ge-you-xu-lian-biao-by-leetcode-solu/
 合并2个有序链表
 */
public class suanfa9 {
//    public Listnode merged(Listnode l1,Listnode l2){
//        Listnode prehead = new Listnode(-1);
//        Listnode prev = prehead;
//        while(l1 != null && l2 !=null){
//            if(l1.var < l2.var){
//                prev.next = l1.var;
//                l1 = l1.next;
//            }else{
//                prev.next = l2.val;
//                l2 = l2.next;
//            }
//            prev = prev.next;
//        }
//        prev.next == l1 == null?l2:l1;
//        return prehead.next;
    //}
    //递归
//    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        if (l1 == null) {
//            return l2;
//        } else if (l2 == null) {
//            return l1;
//        } else if (l1.val < l2.val) {
//            l1.next = mergeTwoLists(l1.next, l2);
//            return l1;
//        } else {
//            l2.next = mergeTwoLists(l1, l2.next);
//            return l2;
//        }
//    }

}

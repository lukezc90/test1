package leetcode;


import ieheima.interview.ListNode;

public class suanfa8 {
//    public ListNode denode(ListNode head){
//        if(head == null){
//            return head;
//        }
//        ListNode cur = head;
//        while(cur.next != null){
//            if(cur.val == cur.next.next){
//                cur.next = cur.next.next;
//            }else {
//                cur = cur.next;
//            }
//        }
//        return head;
//    }
    public static Listnode li(Listnode head){
        if(head == null){
            return  null;
        }
        Listnode cur = head;
        while(cur.next != null){
            if(cur.value == cur.next.value){
                cur.next = cur.next.next;
            }else{
                cur = cur.next;
            }
        }
        return head;
    }
}

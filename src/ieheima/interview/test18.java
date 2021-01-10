package ieheima.interview;

/*
删除排序链表中的重复元素
 */
public class test18 {
    public ListNode deleteD (ListNode head){
        ListNode  current = head;
        while (current !=null && current.next != null){
            if(current.next.val == current.val){
                current.next = current.next.next;
            }else {
                current = current.next;
            }
        }
        return head;
    }
}

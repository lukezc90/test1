package ieheima.interview;

/*
删除链表中的重复字段
 */
public class test17 {
    public static void main(String[] args) {
        ListNode root=new ListNode(0);
        root.next=new ListNode(1);
        root.next.next=new ListNode(2);
        root.next.next.next=new ListNode(2);
        root.next.next.next.next=new ListNode(3);
        root.next.next.next.next.next=new ListNode(3);
        root=deleteDuplication(root);
        while (root!=null){
            System.out.println(root.val);
            root=root.next;
        }
    }
    public static ListNode deleteDuplication(ListNode pHead)
    {
        if(pHead==null)
            return pHead;
        ListNode printNode=new ListNode(0);
        ListNode currentNode=printNode;
        while(pHead!=null){
            int val=pHead.val;
            if(pHead.next!=null&&val==pHead.next.val){
                while(pHead!=null&&val==pHead.val){
                    pHead=pHead.next;
                }
            }else{
                currentNode.next=pHead;
                currentNode=currentNode.next;
                pHead=pHead.next;
            }
            if(pHead==null)
                currentNode.next=null;
        }
        return printNode.next;
    }
}

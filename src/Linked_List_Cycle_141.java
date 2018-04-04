import Helper.ListNode;

/**
 * @author Mert Ozer
 * Given a linked list, determine if it has a cycle in it.

Follow up:
Can you solve it without using extra space?
 */
public class Linked_List_Cycle_141 {
    public boolean hasCycle(ListNode head) {
        if (head == null)
            return false;
        ListNode exit = new ListNode(-1);
        while (head != null){
            if (head.next == exit)
                return true;
            ListNode previous = head;
            head = head.next;
            previous.next = exit;
        }
        return false;
    }
    /*
    public boolean hasCycle(ListNode head) {
    if(head==null) return false;
    ListNode walker = head;
    ListNode runner = head;
    while(runner.next!=null && runner.next.next!=null) {
        walker = walker.next;
        runner = runner.next.next;
        if(walker==runner) return true;
    }
    return false;
}
    * */
}

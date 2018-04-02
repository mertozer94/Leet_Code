import Helper.ListNode;

/**
 * @author Mert Ozer
 * Given a linked list, determine if it has a cycle in it.

Follow up:
Can you solve it without using extra space?
 */
public class Linked_List_Cycle_141 {
    // not correct
    public boolean hasCycle(ListNode head) {
        if (head == null)
            return false;
        ListNode exit = new ListNode(-1);
        while (head != null){
            if (head.next == exit)
                return false;
            ListNode previous = head;
            head = head.next;
            previous.next = exit;
        }
        return true;
    }
}

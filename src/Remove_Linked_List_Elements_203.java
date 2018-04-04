import Helper.ListNode;

/**
 * @author Mert Ozer
 * Remove all elements from a linked list of integers that have value val.

Example
Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
Return: 1 --> 2 --> 3 --> 4 --> 5
 */
public class Remove_Linked_List_Elements_203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode pre = null;
        ListNode curr = head;
        while(curr != null) {
            if (curr.val == val){
                if (pre == null)
                    head = head.next;
                else {
                    pre.next = curr.next;
                }
            }
            else {
                pre = curr;
            }
            curr = curr.next;
        }
        return head;
    }
}

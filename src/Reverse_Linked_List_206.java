import Helper.ListNode;

import java.util.List;

/**
 * @author Mert Ozer
 * Reverse a singly linked list.
 */
public class Reverse_Linked_List_206 {
    public static void main(String[] args){
        ListNode nodes = new ListNode(5);
        nodes.next = new ListNode(4);
        nodes.next.next = new ListNode(2);
        nodes.next.next.next = new ListNode(1);

        ListNode node = reverseList(nodes);
        while (node != null){
            System.out.println(node.val);
            node = node.next;
        }
    }

    public static ListNode reverseList(ListNode head) {
        ListNode node = null;

        while (head != null){
            if (node == null){
                node = new ListNode(head.val);
                node.next = null;
            }
            else {

                ListNode newNode = new ListNode(head.val);
                newNode.next = node;
                node = newNode;

            }
            head = head.next;
        }
        return node;
    }
}

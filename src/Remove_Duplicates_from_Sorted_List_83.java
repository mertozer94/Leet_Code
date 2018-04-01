import Helper.ListNode;

/**
 * @author Mert Ozer
 * Given a sorted linked list, delete all duplicates such that each element appear only once.

For example,
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3.


 */
public class Remove_Duplicates_from_Sorted_List_83 {
    public static void main(String[] args){
        ListNode list = new ListNode(1);
        ListNode list1 = new ListNode(1);
        ListNode list2 = new ListNode(1);
        ListNode list3 = new ListNode(1);
        ListNode list4 = new ListNode(2);
        list.next = list1;
        list1.next = list2;
        list2.next = list3;
        list3.next = list4;

        ListNode a = deleteDuplicates(list);
        while (a != null){
            System.out.println(a.val);
            a = a.next;
        }
    }
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode pre = head;
        ListNode curr = head;
        while (head != null){

            if (head.val == pre.val)
                pre.next = head.next;
            else
                pre = head;

            head = head.next;
        }
        return curr;
    }
}

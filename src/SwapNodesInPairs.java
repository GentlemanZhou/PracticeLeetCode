/**
 * Created by mrzho on 2017/11/17.
 */
public class SwapNodesInPairs {

    public static void main(String[] args) {

    }

    public ListNode swapPairs(ListNode head) {
        ListNode first = new ListNode(0), s;
        first.next = head;
        head = first;
        while (first.next != null && first.next.next != null) {
            s = first.next.next;
            first.next.next = s.next;
            s.next = first.next;
            first.next = s;
            first = s.next;
        }
        return head.next;
    }

    public ListNode swapPairs1(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode ptr1 = head;
        ListNode ptr2 = head.next;

        ptr1.next = swapPairs(ptr2.next);
        ptr2.next = ptr1;

        return ptr2;
    }
}

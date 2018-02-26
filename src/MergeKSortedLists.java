import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeKSortedLists {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(0);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(4);
        ListNode node6 = new ListNode(5);
        ListNode node7 = new ListNode(6);
        ListNode node8 = new ListNode(7);
        ListNode node9 = new ListNode(8);
        ListNode node10 = new ListNode(9);

        node5.next = node1;
        node8.next = node5;

        node3.next = node2;
        node9.next = node3;

        node6.next = node4;
       node7.next = node6;
       node10.next = node7;

        ListNode[] lists = new ListNode[3];
        lists[0] = node8;
        lists[1] = node9;
        lists[2] = node10;
        ListNode aa = mergeKLists(lists);
        System.out.println(aa);
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0){
            return null;
        }
        return bm(lists, 0, lists.length-1);
    }

    private static ListNode bm(ListNode[] lists, int i, int j) {
        if (i == j){
            return lists[i];
        }

        int middle = i + (j-i)/2;

        ListNode l1 = bm(lists, i, middle);
        ListNode l2 = bm(lists, middle + 1, j);
        return merge(l1, l2);
    }


    private static ListNode merge(ListNode a, ListNode b){
        if (a == null) {
            return b;
        }
        if (b == null) {
            return a;
        }

        ListNode res = new ListNode(0);
        ListNode cur = res;

        while (a != null && b != null){
            if (a.val <= b.val){
                cur.next = a;
                a = a.next;
            } else {
                cur.next = b;
                b = b.next;
            }
            cur = cur.next;
        }
        if (a != null) {
            cur.next = a;
        } else {
            cur.next = b;
        }
        return res.next;
    }
}

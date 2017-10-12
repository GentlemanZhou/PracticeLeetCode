public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode param1 = new ListNode(5);
        //param1.next = new ListNode(4);
        //param1.next.next = new ListNode(3);
        ListNode param2 = new ListNode(5);
        //param2.next = new ListNode(6);
        //param2.next.next = new ListNode(4);
        ListNode result = addTwoNumbers(param1, param2);
        System.out.print(result.val);
        while (result.next != null) {
            System.out.print("->");
            System.out.print(result.next.val);
            result = result.next;
        }
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        return calc(l1, l2, carry);
    }

    public static ListNode calc(ListNode l1, ListNode l2, int carry){
        if(l1 == null && l2 == null){
            if(carry != 0){
                return new ListNode(carry);
            }else {
                return null;
            }
        }
        int sum = 0;
        sum = sum + (l1 != null ? l1.val: 0);
        sum = sum + (l2 != null ? l2.val: 0);
        sum = sum + carry;
        carry = sum / 10;
        sum = sum % 10;
        ListNode newNode = new ListNode(sum);
        newNode.next = calc(l1 != null ? l1.next : l1, l2 != null ? l2.next : l2, carry);
        return newNode;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
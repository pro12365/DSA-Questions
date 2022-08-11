class ListNode {
    ListNode next;
    int val;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

}

public class AddtwoSortedLinkedlist {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        int carry = 0;
        ListNode temp = null;
        while (l1 != null || l2 != null) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum = sum + l2.val;
                l2 = l2.next;
            }
            ListNode node = new ListNode(sum % 10);
            carry = sum / 10;
            if (temp == null) {
                node = head = null;
            } else {
                temp.next = node;
                temp = temp.next;
            }
            if (carry > 0) {
                temp.next = new ListNode(carry);
            }
        }
        return head;

    }
}

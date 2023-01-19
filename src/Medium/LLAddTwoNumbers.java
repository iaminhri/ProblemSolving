package Medium;

import Node.ListNode;

public class LLAddTwoNumbers {
    ListNode head1, head2;

    public LLAddTwoNumbers(){
//        ListNode n2 = new ListNode(3, null);
//        ListNode n1 = new ListNode(4, n2);
//        head1 = new ListNode(2, n1);
//
//        ListNode l2 = new ListNode(4, null);
//        ListNode l1 = new ListNode(6, l2);
//        head2 = new ListNode(5, l1);

        ListNode n6 = new ListNode(9, null);
        ListNode n5 = new ListNode(9, n6);
        ListNode n4 = new ListNode(9, n5);
        ListNode n3 = new ListNode(9, n4);
        ListNode n2 = new ListNode(9, n3);
        ListNode n1 = new ListNode(9, n2);
        head1 = new ListNode(9, n1);

        ListNode l3 = new ListNode(9, null);
        ListNode l2 = new ListNode(9, l3);
        ListNode l1 = new ListNode(9, l2);
        head2 = new ListNode(9, l1);

        ListNode p = head1;
        while(p != null){
            System.out.print(p.val + "->");
            p = p.next;
        }

        System.out.println();

        ListNode p1 = head2;
        while(p1 != null){
            System.out.print(p1.val + "->");
            p1 = p1.next;
        }

        System.out.println();

        ListNode p2 = addTwoNumbers(head1, head2);
        while(p2 != null){
            System.out.print(p2.val + "->");
            p2 = p2.next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(0), curr = dummy;

        int carry = 0;

        while(l1 != null || l2 != null || carry == 1){
            int sum = 0;

            if(l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            sum += carry;
            carry = sum / 10;

            curr.next =  new ListNode(sum%10);
            curr = curr.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        new LLAddTwoNumbers();
    }
}

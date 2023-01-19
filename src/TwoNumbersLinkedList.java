//Partial acceptance Rate in leet code for problem Add Two Numbers
import Node.ListNode;

import java.util.List;

public class TwoNumbersLinkedList {
    public ListNode head, head2;

    public TwoNumbersLinkedList(){
        ListNode n1 = new ListNode(9);
        head = n1;

        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode( 9, l1);
        ListNode l3 = new ListNode( 9, l2);
        ListNode l4 = new ListNode( 9, l3);
        ListNode l5 = new ListNode(9, l4);
        ListNode l6 = new ListNode( 9, l5);
        ListNode l7 = new ListNode( 9, l6);
        ListNode l8 = new ListNode( 9, l7);
        ListNode l9 = new ListNode( 9, l8);
        ListNode l10 = new ListNode( 9, l9);
        head2 = l10;

//        ListNode n1 = new ListNode(9);
//        ListNode n2 = new ListNode( 9, n1);
//        ListNode n3 = new ListNode( 9, n2);
//        ListNode n4 = new ListNode( 9, n3);
//        ListNode n5 = new ListNode( 9, n4);
//        ListNode n6 = new ListNo
//        de( 9, n5);
//        ListNode n7 = new ListNode( 9, n6);
//        head = n7;
//
//        ListNode l1 = new ListNode(9);
//        ListNode l2 = new ListNode( 9, l1);
//        ListNode l3 = new ListNode( 9, l2);
//        ListNode l4 = new ListNode( 9, l3);
//        head2 = l4;

//        ListNode n1 = new ListNode(2);
//        ListNode n2 = new ListNode( 4, n1);
//        ListNode n3 = new ListNode( 3, n2);
//        head = n3;
//
//        ListNode l1 = new ListNode(5);
//        ListNode l2 = new ListNode( 6, l1);
//        ListNode l3 = new ListNode( 4, l2);
//        head2 = l3;

//        ListNode n1 = new ListNode(4);
//        head = n1;
//
//        ListNode l1 = new ListNode(5);
//        head2 = l1;

//        ListNode n1 = new ListNode(2);
//        ListNode n2 = new ListNode( 4, n1);
//        ListNode n3 = new ListNode( 9, n2);
//        head = n3;
//
//        ListNode l1 = new ListNode(5);
//        ListNode l2 = new ListNode( 6, l1);
//        ListNode l3 = new ListNode( 4, l2);
//        ListNode l4 = new ListNode( 9, l3);
//        head2 = l4;

//        ListNode p = head;
//        while(p != null){
//            p = p.next;
//        }
//
//        ListNode q = head2;
//        while(q != null){
//            q = q.next;
//        }

        findSumOfTwoLinkedList(head, head2);
    }

    public ListNode reverseList(ListNode l){
        ListNode prev = null;
        ListNode curr = l;
        ListNode next = null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        l = prev;
        return l;
    }

    public ListNode findSumOfTwoLinkedList(ListNode l1, ListNode l2){
        int n1, n2, result;
        int i = 10;
        ListNode outputList = null;
        ListNode newNode, p = null;

        n1 = l1.val;
        while(l1.next != null){
            n1 = (n1 * i) + l1.next.val;
            l1 = l1.next;
        }
        System.out.println(n1);

        n2 = l2.val;
        while (l2.next != null){
            if( ((n2*i) + l2.next.val) >= Integer.MAX_VALUE){

            }
            n2 = (n2*i) + l2.next.val;
            System.out.println("n2: " +n2);
            l2 = l2.next;
        }
        System.out.println(n2);

        result = n1 + n2;
        System.out.println(result);
        int value = 0;
        value = result;

        while(result > 9){
            value = result % 10;
            result = result / 10;

            newNode = new ListNode(value);

            if(p == null){
                outputList = newNode;
                p = outputList;
            }
            else{
                p.next = newNode;
                p = p.next;
            }
        }

        if(p != null){
            newNode = new ListNode(result);
            p.next = newNode;
        }
        else{
            p = new ListNode(result);
            outputList = p;
        }

        ListNode m = outputList;
        System.out.print("Output List: ");
        while(m != null){
            System.out.print(m.val + " ");
            m = m.next;
        }

        return outputList;
    }

    public static void main(String[] args) {
        new TwoNumbersLinkedList();
    }
}

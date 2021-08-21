package leetcode;

public class Solution25 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 2;
        ListNode head = InitListNode.init(arr);
       //reverseKGroup(head,k);
        reverse(head);
        System.out.println();

    }


    public static ListNode reverseKGroup(ListNode head, int k) {




        return null;
    }

    public static ListNode reverse (ListNode head) {
        if (head == null || head.next == null) {
            System.out.println(head.val);
            return head;
        }
        ListNode newhead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        System.out.println(head.val);
        return newhead;

    }




}



package demo;

public class InitListNode {

    static int[] arr = {};

    public static ListNode init(int[] array){
        arr = array;
        return putValue(0);
    }

    public static ListNode putValue(int i){
        if (i >= arr.length) {
            return null;
        }
        ListNode node = new ListNode(arr[i],putValue(++i));



         return node;
    }
}

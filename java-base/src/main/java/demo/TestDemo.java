package demo;


import java.util.*;

public class TestDemo {
    public static void main(String[] args) {
       List<String> a = new ArrayList<>();
       a.add(0,"1");
       a.add(0,"2");
        System.out.println(a);
        Map<Integer,String> map = new HashMap<>();
        String b ="aaa";
        System.out.println(b.substring(0,b.length() - 1));
        Map<String,String> digitsMap = new HashMap<>();
        digitsMap.put("2","abc");
        int[] array =  {1,2,3};
        ListNode listNode = InitListNode.init(array);
        Queue<ListNode> queue = new LinkedList<>();
        queue.offer(listNode);
        System.out.println(queue.size());
        queue.poll();
        System.out.println(queue.size());
        StringBuilder sb = new StringBuilder("addd");


    }
}

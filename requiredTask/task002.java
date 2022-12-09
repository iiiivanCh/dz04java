package requiredTask;

import java.util.LinkedList;
import java.util.Queue;

public class task002 {
    public static void main(String[] args) {
        Queue<String> list = new LinkedList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        System.out.println(list);
        enqueue(list);
        dequeue(list);
        first(list);
    }

    public static void enqueue(Queue<String> list) {
        list.add("end");
        System.out.println(list);
    }

    public static void dequeue(Queue<String> list) {
        String el = list.remove();
        System.out.println(list + "   " + el);
    }

    public static void first(Queue<String> list) {
        String el = list.peek();
        System.out.println(list + "   " + el);
    }
}

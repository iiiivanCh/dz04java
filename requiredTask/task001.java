package requiredTask;

import java.util.LinkedList;

class task001 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        // list.add("8");
        System.out.println(list);
        list = reverseLinkedList(list);
        System.out.println(list);
    }

    public static LinkedList<String> reverseLinkedList(LinkedList<String> input) {
        for (int i = 0; i < input.size() / 2; i++) {
            String temp = input.get(i);
            input.set(i, input.get(input.size() - i - 1));
            input.set(input.size() - i - 1, temp);
        }
        return input;
    }
}
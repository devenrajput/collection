package collection.listpack;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();
        stack.push("one");
        stack.push("two");
        stack.push("three");
        stack.push("four");
        System.out.println(stack.capacity());

        System.out.println(stack.search("nine"));
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());
    }
}

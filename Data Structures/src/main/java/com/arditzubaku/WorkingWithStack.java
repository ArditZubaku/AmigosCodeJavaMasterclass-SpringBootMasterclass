package com.arditzubaku;

import java.util.Stack;

public class WorkingWithStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // element at the top - does not remove
        System.out.println(stack.peek());
        System.out.println(stack.size());
        // shows the element meanwhile removes it
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.empty());
    }
}

package com.dikondwarshivani.Collections;

import java.util.Stack;

public class DemoStack
{
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push("A");
        s.push("B");
        s.push("c");
        System.out.println(s);
        System.out.println(s.pop());//remove top of the stack
        System.out.println(s);
        System.out.println(s.peek());//return top of the stack without removal
        System.out.println(s);
    }
}

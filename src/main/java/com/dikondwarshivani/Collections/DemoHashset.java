package com.dikondwarshivani.Collections;

import java.util.HashSet;

public class DemoHashset
{
    public static void main(String[] args) {
        HashSet h = new HashSet();
        System.out.println(h.add("A")); //true
        System.out.println(h.add("A")); //false

        h.add("B");
        h.add("C");
        h.add("D");
        h.add("E");
        h.add("null");
        System.out.println(h.add("E"));
        System.out.println(h);
    }
}

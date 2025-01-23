package com.dikondwarshivani.Collections;

import java.util.TreeSet;

public class DemoTreeSet
{
    public static void main(String[] args) {
        TreeSet t = new TreeSet();
        t.add("A");
        t.add("B");
        t.add("C");
        t.add("a");
        t.add("L");
        System.out.println(t);
        //t.add(123);//ClassCastException
        //t.add(null);//Null PointerException

        // A B C L a
        //65       97
    }
}

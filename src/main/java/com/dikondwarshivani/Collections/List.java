package com.dikondwarshivani.Collections;

import java.util.ArrayList;
import java.util.Collection;

public class List {
    public static void main(String[] args) {
//        Collection list = new ArrayList();

        ArrayList list1 = new ArrayList();

        list1.add("pramod");
        list1.add("shivani");
        list1.add("vivek");
        list1.add("shivani");   //duplicate allowed
        list1.add(123);
        list1.add(null);
        list1.add(true);

        System.out.println(list1);

    }
}

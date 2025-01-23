package com.dikondwarshivani.Collections;

import java.util.ArrayList;
import java.util.List;

public class List1 {
    public static void main(String[] args) {
        List list =new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("3");
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("1"));
        System.out.println(list.contains(1));
        System.out.println(list.remove("2"));
        System.out.println(list.indexOf("3"));
        System.out.println(list.lastIndexOf("3"));
        list.set(1,"byset");
        System.out.println(list);



    }
}

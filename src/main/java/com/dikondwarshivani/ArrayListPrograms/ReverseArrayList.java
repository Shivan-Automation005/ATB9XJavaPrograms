package com.dikondwarshivani.ArrayListPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArrayList
{
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("Mango");
        list.add("Banana");
        list.add("Mango");
        list.add("Apple");
        System.out.println(list);

        System.out.println(list.toString());

        Collections.reverse(list);
        System.out.println(list);
    }
}

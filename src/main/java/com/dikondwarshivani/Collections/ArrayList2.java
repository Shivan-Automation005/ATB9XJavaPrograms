package com.dikondwarshivani.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList2
{
    public static void main(String[] args) {

        List list1 = new ArrayList();
        list1.add(28);
        list1.add(69);
        list1.add(30);
        list1.add(12);

        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);

        Collections.sort(list1,Collections.reverseOrder());
        System.out.println(list1);
    }
}

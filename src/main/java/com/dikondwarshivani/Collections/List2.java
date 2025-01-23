package com.dikondwarshivani.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List2
{
    public static void main(String[] args) {
        List list =new ArrayList();
        list.add("panner");
        list.add("bread");
        list.add("milk");
        list.add("butter");

        for(int i=0;i< list.size();i++)
        {
            System.out.println(list.get(i));
        }

        for(Object o :list)
        {
            System.out.println(o);
        }

        //Iterator

        Iterator iterator = list.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}

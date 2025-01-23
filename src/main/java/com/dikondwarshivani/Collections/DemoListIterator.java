package com.dikondwarshivani.Collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class DemoListIterator
{
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("shivani");
        list.add("vivek");
        list.add("nath");
        list.add("megha");
        System.out.println(list);

        ListIterator itr = list.listIterator();
        while (itr.hasNext())
        {
            String s =(String)itr.next();

            if(s.equals("nath"))
            {
                itr.remove();

            }
            else if(s.equals("shivani") )
            {
                itr.add("abhi");
            } else if (s.equals("vivek"))
            {
                itr.set("shivani");
            }


        }
        System.out.println(list);

    }
}

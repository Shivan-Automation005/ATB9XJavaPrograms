package com.dikondwarshivani.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java .util.List;

public class Generic_List {
    public static void main(String[] args) {
        List <String> list = new ArrayList();
        list.add("hello");
        list.add("how are you");
        list.add("khana khake jaana ");
        Iterator<String> itr = list.iterator();
        while(itr.hasNext())
        {
            String s = itr.next();
            System.out.println(s);
        }

    }
}

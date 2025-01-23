package com.dikondwarshivani.Collections;

import java.util.*;

public class DemoHashMap
{
    public static void main(String[] args) {
        HashMap m = new HashMap();
        m.put("vivek",100);
        m.put("nath",200);
        m.put("ravi",300);
        m.put("ram",1000);
        System.out.println(m);
        System.out.println(m.put("ravi",10));//if key is already present
        // then old value will be replaced with the new value and returns the old value
        System.out.println(m);
        Set s= m.keySet();
        System.out.println(s);

        Collection c = m.values();
        System.out.println(c);

        Set s1 = m.entrySet();
        System.out.println(s1);

        Iterator itr = s1.iterator();
        while(itr.hasNext())
        {
            Map.Entry m1 = (Map.Entry)itr.next();
            System.out.println(m1.getKey()+"---"+m1.getValue());

            if (m1.getKey().equals("nath")) {

                m1.setValue("000");
            }

        }
        System.out.println(m);
    }
}

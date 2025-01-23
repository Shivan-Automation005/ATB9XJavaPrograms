package com.dikondwarshivani.Collections;

import java.util.HashMap;
import java.util.Map;

public class Demo1Hashmap
{
    public static void main(String[] args) {
        Map  <String,Integer> m= new HashMap();
        m.put("vivek",100);
        m.put("nath",200);
        m.put("ravi",300);
        m.put("ram",1000);
        m.put("null",233);
        m.put("null",234);

        //Iterate

        for(Map.Entry<String,Integer> item :m.entrySet())
        {
            System.out.println(item.getKey()+"-->"+item.getValue());
        }
    }

}

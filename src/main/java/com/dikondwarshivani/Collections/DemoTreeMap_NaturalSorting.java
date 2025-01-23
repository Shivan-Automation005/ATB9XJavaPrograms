package com.dikondwarshivani.Collections;

import java.util.TreeMap;
import java.util.Map;

public class DemoTreeMap_NaturalSorting
{
    public static void main(String[] args) {
        TreeMap map = new TreeMap();
        map.put(100,"222");
        map.put(103,"aaa");
        map.put(104,"bbb");
        map.put(106, 105);


        //map.put("FFF","xxx");//For natural sorting keys should be homogeneous and comparable otherwise will
        //get RE(Class Cast Exception)
        //map.put(null,"xxx");//NullPointerException

        System.out.println(map);



    }
}

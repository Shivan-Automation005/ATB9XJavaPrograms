package com.dikondwarshivani.Collections;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashtableDemo
{
    public static void main(String[] args) {
         //Hashtable->Synchronised,slow and legacy class
        Hashtable<Integer,String> hashtable = new Hashtable();
        hashtable.put(1,"one");
        hashtable.put(3,"three");
        hashtable.put(2,"two");
        //hashtable.put(null,"123");//Null key is not allowed gives NullPointerException
        //hashtable.put(4,null);//Value also not allowed gives NullPointerException
       // System.out.println(hashtable);

        Enumeration<Integer> e = hashtable.keys();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }





    }
}

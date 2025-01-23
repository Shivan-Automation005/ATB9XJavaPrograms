package com.dikondwarshivani.Collections;
import java.util.Vector;
public class Vector01
{
    public static void main(String[] args) {

        Vector v = new Vector();

        for(int i=0; i<=10;i++)
        {
            v.addElement(i);
        }
        System.out.println(v);
        System.out.println(v.capacity());
    }
}

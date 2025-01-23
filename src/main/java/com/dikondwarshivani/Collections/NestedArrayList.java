package com.dikondwarshivani.Collections;

import java.util.ArrayList;
import java.util.List;

public class NestedArrayList {
    public static void main(String[] args) {
        List fruit1 = new ArrayList();
        fruit1.add("mango");
        fruit1.add("grapes");
        fruit1.add("payaya");
        System.out.println(fruit1);

        List fruit2 = new ArrayList();
        fruit2.add("banana");
        fruit2.add("gauva");
        fruit2.add("pomogranrate");
        System.out.println(fruit2);

        List all_fruits= new ArrayList();
        all_fruits.add(fruit1);
        all_fruits.add(fruit2);
        System.out.println(all_fruits);



    }
}

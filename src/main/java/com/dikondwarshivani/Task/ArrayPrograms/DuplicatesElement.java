package com.dikondwarshivani.Task.ArrayPrograms;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesElement
{
    public static void main(String[] args) {
        int a[]={3,5,4,3,2,2,1,3,2};
        Set<Integer> s= new HashSet<>();
        for(int no:a){
            if(s.add(no)==false)
            {
                System.out.println(no);
            }

        }

    }

}

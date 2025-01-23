package com.dikondwarshivani.Task;

import java.util.Arrays;

public class AnagramProgram
{
    public static void main(String[] args) {
        String x="SILENT";
        String y="LISTEN";

        char a[]=x.toCharArray();
        char b[]=y.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        boolean result=Arrays.equals(a,b);
        if(result==true){
            System.out.println("It is anagram");
        }
        else {
            System.out.println("It is not anagram");
        }

    }
}

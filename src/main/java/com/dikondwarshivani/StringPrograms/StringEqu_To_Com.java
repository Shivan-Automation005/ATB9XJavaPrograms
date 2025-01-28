package com.dikondwarshivani.StringPrograms;

public class StringEqu_To_Com
{
    public static void main(String[] args) {
        String s1="Hello";
        String s4="Hello";

        String s2= new String("Hello");
        String s3=new String("hello");
        String s5=new String("Hello");

        //== Comparion (reference comparion)
        System.out.println(s1==s2);
        System.out.println(s1==s4);
        System.out.println(s3==s4);

        //equalto->content(value)

        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s2.equalsIgnoreCase(s3));
    }
}

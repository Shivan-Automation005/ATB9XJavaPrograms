package com.dikondwarshivani.StringPrograms;

public class StringChar
{
    public static void main(String[] args) {
        String s1="shivani";
        System.out.println(s1.charAt(3));
        //System.out.println(s1.charAt(10));//StringIndexOutOfBound Exception

        String s2=" shivani ";
        System.out.println(s2.trim());// to remove the spaces


        String s5="shivani";
        System.out.println(s5.indexOf("v"));
        System.out.println(s5.indexOf("i"));

        String s6="shivani";
        System.out.println(s6.contains("v"));
        System.out.println(s6.contains("va"));

        System.out.println(s6.contains("in"));

        System.out.println(s6.lastIndexOf("a"));

        System.out.println(s6.replace("v","z"));

        System.out.println(s6.startsWith("sh"));
        System.out.println(s6.endsWith("ni"));

        String s10="Hello456 world321!";
        String s7=s10.replaceAll("\\d","");
        System.out.println(s7);

        String s8=s7.replaceAll("o","O");
        System.out.println(s8);



    }
}

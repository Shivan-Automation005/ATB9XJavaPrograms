package com.dikondwarshivani.StringPrograms;

public class StringBuilder_StringBuilder
{
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Pramod");
        stringBuffer.append("dutta");
        System.out.println(stringBuffer);
        stringBuffer.reverse();
        System.out.println(stringBuffer);


        StringBuilder stringBuilder = new StringBuilder("shivani");
        stringBuilder.append("dikondwar");
        System.out.println(stringBuilder);

        StringBuilder stringBuilder1 = new StringBuilder("Hello");
        stringBuilder1.append("world");
        System.out.println(stringBuilder1);//Modifies the string to Hello World

        String s1="Hello";
        String s2="World";
        String s3=s1+s2;
        System.out.println(s3);//Create a new String Hello World
        System.out.println(s1);


    }
}

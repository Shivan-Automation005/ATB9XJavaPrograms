package com.dikondwarshivani.StringPrograms;

public class Split_String
{
    public static void main(String[] args) {
        String fruits="apple,banana,mango";
        String[] spli_fruit=fruits.split(",");
        System.out.println(spli_fruit[0]);
        System.out.println(spli_fruit[1]);
        System.out.println(spli_fruit[2]);

        String fruits1="ABC-XYZ-PMN";
        String[] spli_fruit1=fruits1.split("-");
        System.out.println(spli_fruit1[0]);
        System.out.println(spli_fruit1[1]);
        System.out.println(spli_fruit1[2]);



    }
}

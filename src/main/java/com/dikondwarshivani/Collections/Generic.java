package com.dikondwarshivani.Collections;

public class Generic
{
    public static void main(String[] args) {

      Temp_Sum(23,47);
      Temp_Sum("shivani","Dikondwar");
      Temp_Sum(true,false);

    }
    public static <T> T Temp_Sum(T a, T b)
    {
        System.out.println(a);
        System.out.println(b);
        return null;
    }
}

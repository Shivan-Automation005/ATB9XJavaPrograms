package com.dikondwarshivani.Operators;

public class Typecastingdemo
{
    public static void main(String[] args) {
        long phone_no=9373372992l;
      // short s=phone_no;//Implicit JVM will do
        short s1= (short)phone_no;//Explicit casting User will so
        //Loss the data
    }
}

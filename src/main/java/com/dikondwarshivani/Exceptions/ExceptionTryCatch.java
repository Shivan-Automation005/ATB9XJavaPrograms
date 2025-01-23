package com.dikondwarshivani.Exceptions;

public class ExceptionTryCatch
{
    public static void main(String[] args) {
        int a=0;
        int c=0;
        try {
            c=10/a;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("I will be always be executed");
        }

    }
}


package com.dikondwarshivani.Exceptions;

public class ExampleOfUnchecked
{
    public static void main(String[] args) {
        try {
            int a=10/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("I will executed any How!");
        }

    }
}

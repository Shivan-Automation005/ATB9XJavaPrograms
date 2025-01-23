package com.dikondwarshivani.Exceptions;

import java.util.Scanner;

public class ExceptionFinally
{
    public static void main(String[] args) {
        Scanner sc=null;
        sc= new Scanner(System.in);
        int v= sc.nextInt();

        try {
            int a=10/0;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally
        {
            sc.close();
            System.out.println("Hello");

        }


    }
}

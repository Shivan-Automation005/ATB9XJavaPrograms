package com.dikondwarshivani.Task.FunctionsTask;

import java.util.Scanner;

public class FunctionTask1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first no");
        int a=sc.nextInt();
        System.out.println("Enter the second no");
        int b= sc.nextInt();

        int add=sum(a,b);
        System.out.println("Addition of two no is:"+add);
        int minus=sub(a,b);
        System.out.println("Substraction of two is:"+minus);
        int multiplication=mul(a,b);
        System.out.println("Multiplication of two no is:"+multiplication);
        int division=div(a,b);
        System.out.println("Division of two no is:"+division);



    }

    static int sum(int a, int b)
    {

        return a+b;
    }
    static int sub(int a, int b)
    {

        return a-b;
    }
    static  int mul(int a, int b)
    {
        return  a*b;

    }
    static  int div(int a, int b)
    {

        return a/b;
    }


}

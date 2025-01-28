package com.dikondwarshivani.Task.TernaryTask;

public class Ternary01
{
    public static void main(String[] args) {
        int a=10, b=32, c=26;
        //int result=(a>b && a>c)? a : ((b>a && b>c)? b : c);
        int r= (a>b && a>c) ? a : (b>=c ? b: c);
        System.out.println(r);
    }
}

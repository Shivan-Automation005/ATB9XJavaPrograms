package com.dikondwarshivani.Task;

public class FibonaaciSeries
{
    public static void main(String[] args) {
        int no=3;
        int a=0;
        int b=1;
        System.out.print(a);
        System.out.print(b);
        int c=a+b;
        System.out.print(c);
        for(int i=2;i<=no;i++){
            a=b;
            b=c;
            c=a+b;
            System.out.print(c);
        }
    }
}

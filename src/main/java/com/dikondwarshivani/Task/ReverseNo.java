package com.dikondwarshivani.Task;

public class ReverseNo
{
    public static void main(String[] args) {
        int no=987654, rev=0,rem=0;
        while(no>0)
        {
            rem=no%10;
            rev=rev*10+rem;
            no=no/10;
        }
        System.out.println(rev);
    }
}

package com.dikondwarshivani.Task;

public class SumOfDigit
{
    public static void main(String[] args) {
        int no=1234;
        int rem=0;
        int sum=0;
        while(no>0)
        {
            rem=no%10;
            sum=sum+rem;
            no=no/10;
        }
        System.out.println("sum of digits "+sum);
    }
}

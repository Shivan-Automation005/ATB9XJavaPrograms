package com.dikondwarshivani.Task;

public class PrimeNo
{
    public static void main(String[] args) {
        int no=15;
        int count=0;

        for(int i=2;i<=no/2;i++) {
            if (no % 2 == 0) {
                count++;
                break;
            }
        }
        if(count==0)
        {
            System.out.println("no is prime");

        }
        else
        {
            System.out.println("no is not prime");

        }
    }
}

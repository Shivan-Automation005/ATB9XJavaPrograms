package com.dikondwarshivani.Task;

public class FactorialNo
{
    public static void main(String[] args) {
        int fact=1;
        int no=5;
        for(int i=1;i<=no;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}

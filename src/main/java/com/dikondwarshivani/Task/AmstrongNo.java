package com.dikondwarshivani.Task;

public class AmstrongNo
{
    public static void main(String[] args) {
        int r, sum=0,temp;
        int no=153;
        temp=no;
        while(temp>0)
        {
            r=temp%10;
            sum=sum+r*r*r;
            temp=temp/10;

        }
        if(sum==no)
        {
            System.out.println("No is Amstrong");

        }
        else
        {
            System.out.println("No is not Amstrong");
        }
    }
}

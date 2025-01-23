package com.dikondwarshivani.Task.ArrayPrograms;

public class SecondHighestNo
{
    public static void main(String[] args) {
        int a[]={15,12,13,15,2};
        int first=0, second=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>first){
                second=first;
                first=a[i];
                System.out.println("Largest no: "+first);
            } else if (a[i]>second && a[i]!=first)
            {
                second=a[i];

            }
        }
        System.out.println("Second Smallest no is: "+second);
    }
}

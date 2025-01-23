package com.dikondwarshivani.Task.ArrayPrograms;

public class ReverseArray
{
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        int i,j;

        for(i=0,j = a.length - 1; i<j; i++, j--)
        {
            int temp = a[i];
            a[i]=a[j];
            a[j]=temp;

        }
        for( i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}

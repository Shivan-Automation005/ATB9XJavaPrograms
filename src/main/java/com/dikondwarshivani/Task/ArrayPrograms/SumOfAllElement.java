package com.dikondwarshivani.Task.ArrayPrograms;

public class SumOfAllElement
{
    public static void main(String[] args) {
        int a[]={10,30,4,20,29,30};
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        System.out.println(sum);
    }
}

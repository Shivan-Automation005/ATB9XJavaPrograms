package com.dikondwarshivani.Task.ArrayPrograms;

public class LargestElementINArray
{
    public static void main(String[] args) {
        int a[]={10,20,30,5,9};
        int max=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("the largest element in array is :"+max);
    }
}

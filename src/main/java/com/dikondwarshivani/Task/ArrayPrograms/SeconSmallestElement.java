package com.dikondwarshivani.Task.ArrayPrograms;

public class SeconSmallestElement
{
    public static void main(String[] args) {
        int a[]={10,20,40,30,6,19};
        int min=1000;
        int sec_min=1000;
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                sec_min=min;
                min=a[i];
            } else if (a[i]<sec_min && a[i]!=min) {
                sec_min=a[i];

            }
        }
        System.out.println(sec_min);
//        System.out.println(min);
    }
}

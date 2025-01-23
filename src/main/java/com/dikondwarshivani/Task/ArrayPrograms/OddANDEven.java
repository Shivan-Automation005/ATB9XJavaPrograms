package com.dikondwarshivani.Task.ArrayPrograms;

public class OddANDEven
{
    public static void main(String[] args) {
        int a[]={2,4,5,6,8,0,1};
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                System.out.println("Even no in array array are: "+a[i]);
            }
            else
            {
                System.out.println("Odd no are:"+a[i]);
            }
        }
    }
}

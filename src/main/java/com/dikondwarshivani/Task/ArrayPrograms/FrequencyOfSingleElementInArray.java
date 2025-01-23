package com.dikondwarshivani.Task.ArrayPrograms;

public class FrequencyOfSingleElementInArray
{
    public static void main(String[] args) {
        int a[]={10,20,20,10,30};
        int freq=0,key=10;
        for(int i=0;i<a.length;i++){
            if(a[i]==key){
                freq++;
            }
        }
        System.out.println("frequency of 10 is "+freq);

    }
}

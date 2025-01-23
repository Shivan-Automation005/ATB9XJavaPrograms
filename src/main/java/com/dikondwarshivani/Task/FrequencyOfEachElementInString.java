package com.dikondwarshivani.Task;

public class FrequencyOfEachElementInString
{
    public static void main(String[] args) {
        String s="aaaabbbccd";
        int a[]= new int[256];
        for(int i=0;i<s.length()-1;i++){
            int x=s.charAt(i);
            a[x]++;

        }
        for(int i=1;i<a.length-1;i++){
            if(a[i]!=0){
                System.out.println((char)i);
                System.out.println(a[i]);
            }
        }
    }
}

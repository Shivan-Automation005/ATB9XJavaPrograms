package com.dikondwarshivani.Task;

public class FrequencyBySingleCharacter
{
    public static void main(String[] args) {
        String input="this is a mango";
        char ch='s';
        int count=0;
        for(int i=0;i<input.length();i++)
        {
            //System.out.println(input.charAt(i));
            if(ch==input.charAt(i))
            {
                count=count+1;
                //System.out.println("found match"+i);
            }
        }
        System.out.println(" Frequency of total occurrence of s is: "+count);
    }
}

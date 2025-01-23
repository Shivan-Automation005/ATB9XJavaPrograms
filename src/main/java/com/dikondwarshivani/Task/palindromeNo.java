package com.dikondwarshivani.Task;

public class palindromeNo
{
    public static void main(String[] args) {
        String s="LOL";
        String s1="";
        for(int i=s.length()-1;i>=0;i--)
        {
            s1=s1+s.charAt(i);

        }

        System.out.println(s1);
        if(s.equals(s1))
        {
            System.out.println("The string is palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}

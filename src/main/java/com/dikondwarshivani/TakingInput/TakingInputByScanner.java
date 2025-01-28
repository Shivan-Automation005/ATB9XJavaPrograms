package com.dikondwarshivani.TakingInput;

import java.util.Scanner;

public class TakingInputByScanner
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
         int age = sc.nextInt();
         String r = age > 25 ? "Allowed to Goa" : "Not allowed to Goa";
        System.out.println(r);
        sc.close();
    }
}

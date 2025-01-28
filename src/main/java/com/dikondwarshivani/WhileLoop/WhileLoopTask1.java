package com.dikondwarshivani.WhileLoop;

import java.util.Scanner;

public class WhileLoopTask1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();

        while(age>0)
        {
            System.out.println(age);
            age--;

        }
    }
}

package com.dikondwarshivani.IfPrograms;

import java.util.Scanner;

public class IfDemo1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which you want know if it is even or odd");
        int num = sc.nextInt();

        if(num%2==0){
            System.out.println("The num is even");
        }
        else
        {
            System.out.println("The num is odd");
        }
    }
}

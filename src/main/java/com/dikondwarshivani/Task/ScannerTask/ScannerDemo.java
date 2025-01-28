package com.dikondwarshivani.Task.ScannerTask;

import java.util.Scanner;

public class ScannerDemo
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the name\n ");
        String name_person=sc.nextLine();
        System.out.println("Enter the age\n");
        int age =sc.nextInt();
        System.out.println("Enter the salary\n");
        int salary =sc.nextInt();

        System.out.println(name_person);
        System.out.println(age);
        System.out.println(salary);
    }
}

package com.dikondwarshivani.Task;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerClass
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");

        String name = scanner.nextLine();

        System.out.println("Enter your age");

        Integer age = scanner.nextInt();

        System.out.println("Hello,"+name+" You are "+age);

        scanner.close();

    }
}

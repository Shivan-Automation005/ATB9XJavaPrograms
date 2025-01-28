package com.dikondwarshivani.Task.ScannerTask;

public class Task2
{
    public static void main(String[] args) {


        int salary1= Integer.parseInt(args[0]);
        int salary2= Integer.parseInt(args[1]);

        String r = salary1 > salary2  ? "salary 1 is maximum" : "salary2 is maximum";
        System.out.println(r);
    }
}

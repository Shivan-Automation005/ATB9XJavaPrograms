package com.dikondwarshivani.Task.SwitchTask;

import java.util.Scanner;

public class SwitchTask2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no for the month");
        int month = sc.nextInt();
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("april");
                break;
            case 5:
                System.out.println("may");
                break;
            case 6:
                System.out.println("june");
                break;
                case 7:
                System.out.println("july");
                break;
                case 8:
                System.out.println("august");
                break;
            default:
                System.out.println("There is no such month ");




        }

    }


}

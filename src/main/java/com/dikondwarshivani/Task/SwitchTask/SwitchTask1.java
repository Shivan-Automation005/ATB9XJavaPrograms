package com.dikondwarshivani.Task.SwitchTask;

import java.util.Scanner;

public class SwitchTask1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int num1=sc.nextInt();
        System.out.println("Enter the 2nd number");
        int num2=sc.nextInt();
        System.out.println("Enter the operator you want to perform");

        String operator=sc.next();

        switch(operator){
            case "+":
                System.out.println("Addition"+(num1+num2));
                break;
            case "-":
                System.out.println("Substraction"+(num1-num2));
                break;
            case "*":
                System.out.println("Multiplication"+(num1*num2));
                break;
                case "/":
                    System.out.println("Division"+(num1/num2));
                    break;
            default:
                System.out.println("Invalid number8");



        }

    }



}

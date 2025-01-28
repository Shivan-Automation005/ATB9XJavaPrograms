package com.dikondwarshivani.WhileLoop;

public class WhileLoopDemo2
{
    public static void main(String[] args) {
        String args_1=args[0];
        int age = Integer.parseInt(args_1);
        while(age>0){
            System.out.println(age);
            age--;
        }

    }
}

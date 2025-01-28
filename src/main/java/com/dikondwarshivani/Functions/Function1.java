package com.dikondwarshivani.Functions;

public class Function1
{
    public static void main(String[] args) {
        //User Defined Functions
        //Without Parameter and Without return Type

        greet();

        //Without Parameter and with return Type
        String s=greet_with_hello();
        System.out.println(s);


        //With Parameter and without Return Type

        greet1("Vivek");



        //With Parameter and With Return Type

        int result=sum_of_two(3,4);
        System.out.println(result);

    }


    static void greet(){
        System.out.println("Hi, How are you");
    }


    static String greet_with_hello()
    {
        System.out.println("Hello, I am fine");
        return "Hello, I am shivani";
    }
    static void greet1(String s)
    {
        System.out.println("Hello, I am awesome");
        System.out.println("Hello Handsome,"+s);
    }
    static int sum_of_two(int a, int b){
        return a+b;
    }





}

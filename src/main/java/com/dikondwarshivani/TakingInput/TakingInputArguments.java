package com.dikondwarshivani.TakingInput;

public class TakingInputArguments
{
    public static void main(String[] args) {

        int age= Integer.parseInt(args[0]);
        String r = age > 25 ? "Allowed to Goa" : "Not Allowed";
        System.out.println(r);
    }

}

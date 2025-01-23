package com.dikondwarshivani.Collections;

import javax.print.attribute.standard.PagesPerMinute;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class ArrayList1
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names= new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();

        String continuInput = "Y"; // control variable for input loop
        while(continuInput.equalsIgnoreCase("Y"))
        {
            System.out.println("Enter name");
            String name = scanner.nextLine();
            names.add(name);


            System.out.println("Enter age: ");
            Integer ages = scanner.nextInt();
            age.add(ages);

            scanner.nextLine();

            System.out.println("do you want to enter another record (Y/N)");

            continuInput=scanner.nextLine();




        }

        System.out.println("Names"+names);
        System.out.println("Ages"+ age);


        scanner.close();

    }
}

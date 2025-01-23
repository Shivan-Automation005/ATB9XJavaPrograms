package com.dikondwarshivani.Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExampleOfChecked {
    public static void main(String[] args) {
        try
            {
                FileReader f = new FileReader("C://abc.txt");
            } catch (FileNotFoundException e)
            {
                System.out.println(e.getMessage());
            } finally
            {
                System.out.println("I am executed");
            }
        }
    }



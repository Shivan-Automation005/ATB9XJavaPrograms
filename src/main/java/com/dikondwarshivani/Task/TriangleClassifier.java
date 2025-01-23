package com.dikondwarshivani.Task;

public class TriangleClassifier
{
    public static void main(String[] args) {
        int side1=5;
        int side2=2;
        int side3= 2;
        if(side1==side2 && side2==side3 && side1==side3)
            System.out.println("Equilaterial trianle");
        else if (side1==side2 || side1==side3 || side2==side3) {
            System.out.println("Isosceles triangle");

        }
        else {
            System.out.println("scalane triangle");
        }

    }
}

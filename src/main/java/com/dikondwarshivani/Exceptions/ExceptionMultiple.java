package com.dikondwarshivani.Exceptions;

public class ExceptionMultiple {
    public static void main(String[] args) {
        try {
            String ip = args[0];//java.lang.ArrayIndexOutOfBound Exception
            int a = Integer.parseInt(ip);//NumberFormatException
            int b = 100 / a;//Arithmatic Exception
            System.out.println(b);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());

        }
        finally {
            System.out.println("end");
        }
    }
}


package com.company;

public class Main {

    public static void main(String[] args) {


        try {
            int[] numbers = {1, 2, 3, 4, 5};

            System.out.println(numbers[7]);

        } catch (Exception e) {
            System.out.println("Outside of bound message.");
        }

    }
}
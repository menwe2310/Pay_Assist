package com.menwe;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Welcome To PayAssist");
        TimeUnit.SECONDS.sleep(2);

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.next();
        TimeUnit.SECONDS.sleep(2);

        System.out.println("What would you like to pay for?");
        String item = scanner.next();
        TimeUnit.SECONDS.sleep(2);

        System.out.println("How much is this?");
        Double price = scanner.nextDouble();
        TimeUnit.SECONDS.sleep(2);

        if (price >= 1000) {
            System.out.println("Dear " + name + ",");
            System.out.println("Thank you for paying for the following item: ");
            System.out.println("Item: " + item);
            System.out.println("Price: " + price);
            TimeUnit.SECONDS.sleep(2);

            System.out.println("Thank you for using PayAssist.");
        }
        else {
            System.out.println("1000 is the minimum amount. Please try again");
        }















    }
}

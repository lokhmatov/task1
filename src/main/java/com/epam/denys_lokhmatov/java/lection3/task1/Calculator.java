package com.epam.denys_lokhmatov.java.lection3.task1;

import java.util.Scanner;

public class Calculator {
    int a;
    int b;

    public int getA() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the A number:");
        if (sc.hasNextInt()) {
            a = sc.nextInt();
        }
        return a;
    }

    public int getB() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the B number:");
        if (sc.hasNextInt()) {
            b = sc.nextInt();
        }
        return b;
    }

    public int getSum() {
        System.out.println("Result of addition: ");
        System.out.println(a + b);
        return a + b;
    }

    public int getSubtraction() {
        System.out.println("Result of subtraction: ");
        System.out.println(a - b);
        return a - b;
    }

    public int getMult() {
        System.out.println("Result of multiplication: ");
        System.out.println(a * b);
        return a * b;
    }

    public int getDiv() {
        int result = 0;
        try {
            result = a / b;
        } catch (ArithmeticException ex) {
            System.out.println("Can't divide by zero!");
        }
        return result;
    }
}

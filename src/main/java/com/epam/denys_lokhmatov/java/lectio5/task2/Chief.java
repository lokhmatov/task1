package com.epam.denys_lokhmatov.java.lectio5.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Chief {
    private String chiefName;
    private String restaurant;
    private Salad salad;

    public Chief() {
        this.chiefName = chiefName;
        this.restaurant = restaurant;
        this.salad = new Salad();
    }

    public Chief(String chiefName, String restaurant) {
        this.chiefName = chiefName;
        this.restaurant = restaurant;
        salad = new Salad();
    }

    public Chief(String chiefName, String restaurant, Salad salad) {
        this.chiefName = chiefName;
        this.restaurant = restaurant;
        this.salad = salad;
    }

    public void makeSalad() {
        int choice = -1;
        Salad salad = null;
        Scanner sc = new Scanner(System.in);

        while (choice != 0) {
            System.out.println("1. Spring salad");
            System.out.println("2. Venigrette");
            System.out.println("0. No, Thanks!");

            try {
                System.out.println("What salad you prefer?");
                choice = sc.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Try again!");
                sc.next();
                choice = -1;
            }

            switch (choice) {
                case 1:
                    salad = new SpringSalad();
                    break;
                case 2:
                    salad = new Venigrette();
                    break;
            }
        }
        sc.close();
    }
}

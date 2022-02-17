package com.epam.denys_lokhmatov.java.lection3.task1;

import java.util.Scanner;

public class StringProcessing {
    public void shortAndLongString() {
        int count = 5;
        String[] strings;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        if (sc.hasNext()) {
            int max = 0;
            int min = 0;
            strings = new String[count];

            for (int i = 0; i < count; i++) {
                strings[i] = sc.nextLine();
                if (strings[i].length() <= strings[min].length()) {
                    min = i;
                }
                if (strings[i].length() >= strings[max].length()) {
                    max = i;
                }
                System.out.println("Shortest string: " + strings[min].length() + " - " + strings[min]);
                System.out.println("Longest string: " + strings[max].length() + " - " + strings[max]);
            }
        }
    }
}

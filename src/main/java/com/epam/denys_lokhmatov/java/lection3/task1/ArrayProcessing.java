package com.epam.denys_lokhmatov.java.lection3.task1;

public class ArrayProcessing {
    int[] array = new int[20];

    /**
     * Filling array with random int in range from -10 to 10
     */
    public void arrayFilling() {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 20) - 10);
        }
    }

    /**
     * Replace all negative int with 0
     */
    public int[] negativeToZero() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = 0;
            }
        }
        return array;
    }
}

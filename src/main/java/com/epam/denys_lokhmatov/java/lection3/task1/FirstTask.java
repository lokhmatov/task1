package com.epam.denys_lokhmatov.java.lection3.task1;

public class FirstTask {
    public static void main(String[] args) {
        FirstTask firstTask = new FirstTask();
        firstTask.startApplication();
    }

    public void startApplication() {
        ArrayProcessing arrayProcessing = new ArrayProcessing();
        arrayProcessing.arrayFilling();
        arrayProcessing.negativeToZero();

        StringProcessing stringProcessing = new StringProcessing();
        stringProcessing.shortAndLongString();

        Calculator calculator = new Calculator();
        calculator.getA();
        calculator.getB();
        calculator.getSum();
        calculator.getSubtraction();
        calculator.getMult();
        calculator.getDiv();
    }
}

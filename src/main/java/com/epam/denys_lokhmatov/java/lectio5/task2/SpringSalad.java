package com.epam.denys_lokhmatov.java.lectio5.task2;

public class SpringSalad extends Salad {
    public SpringSalad() {
        setName("SpringSalad");

        addVegetables(new Cucumber(300));
        addVegetables(new Tomato(300));
        addVegetables(new Onion(50));
        addVegetables(new Lettuce(200));
        System.out.println("Spring salad contains " + countKcal() + "kcal");
        showIngredients();
        System.out.println();
    }
}

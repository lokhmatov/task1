package com.epam.denys_lokhmatov.java.lectio5.task2;

public class Venigrette extends Salad {
    public Venigrette() {
        setName("Venigrette");

        addVegetables(new Potato(400));
        addVegetables(new Beetroot(200));
        addVegetables(new Onion(100));
        addVegetables(new Carrot(300));
        System.out.println("Venigrette contains " + countKcal() + "kcal");
        showIngredients();
        System.out.println();
    }
}

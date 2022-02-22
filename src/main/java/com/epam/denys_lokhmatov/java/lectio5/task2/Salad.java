package com.epam.denys_lokhmatov.java.lectio5.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Salad {
    private String name;
    private List<Vegetable> vegetables = new ArrayList<Vegetable>();

    public Salad () {
        name = "";
    }

    public Salad(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Vegetable> getVegetables() {
        return vegetables;
    }

    public boolean addVegetables(Vegetable vegetable) {
        return vegetables.add(vegetable);
    }

    public double countKcal() {
        double kcalValue = 0.0;
        for( Vegetable vegetable: vegetables) {
            kcalValue += vegetable.getTotalKcal();
        }
        return kcalValue;
    }

    public void sortVegetablesByKcal() {
        Collections.sort(vegetables, new KcalComparator());
    }

    public void showIngredients() {
        for (Vegetable vegetable: vegetables) {
            System.out.println(vegetable.getName() + " " + vegetable.getKcal() + "kcal");
        }
    }
}

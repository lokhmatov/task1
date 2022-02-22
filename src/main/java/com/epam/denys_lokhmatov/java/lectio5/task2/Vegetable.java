package com.epam.denys_lokhmatov.java.lectio5.task2;

abstract public class Vegetable {
    private String name;
    private String type;
    private double kcal;
    private double weight;

    public Vegetable(String name) {
        this.name = name;
    }

    public Vegetable(String name, double kcal) {
        this.name = name;
        this.kcal = kcal;
    }

    public Vegetable(String name, double kcal, double weight) {
        this.name = name;
        this.kcal = kcal;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getKcal() {
        return kcal;
    }

    public void setKcal(double kcal) {
        this.kcal = kcal;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getTotalKcal() {
        return kcal * (weight / 100);
    }

    @Override
    public String toString() {
        return "Vegetable{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", kcal=" + kcal +
                ", weight=" + weight +
                '}';
    }
}

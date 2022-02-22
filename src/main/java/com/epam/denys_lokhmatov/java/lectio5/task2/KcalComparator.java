package com.epam.denys_lokhmatov.java.lectio5.task2;

import java.util.Comparator;

public class KcalComparator implements Comparator<Vegetable> {
    @Override
    public int compare(Vegetable o1, Vegetable o2) {
        return (int) (o1.getKcal() - o2.getKcal());
    }
}

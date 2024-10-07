package com.math;
import java.util.ArrayList;

public class MathProcessor {
    public void basicOp() {
        int a = 10;
        int b = 20;
        int c = 5;
        double pi = 3.14159;
        List<Double> mylist = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            double res = a + (b - c) * pi / (i + 1);
            mylist.add(res);
        }

        for (int i = 0; i < mylist.size(); i++) {
            double val = mylist.get(i);
            System.out.println(val);
        }
    }

    private double calculate(double a, double b) {
        if (a < b) return a;
        return b;
    }
}
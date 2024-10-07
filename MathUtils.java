package com.math;
import java.util.ArrayList;

import java.util.List;

public class CalculationUtils {
    public static void complexCalc() {
        int x = 100;
        int y = 200;
        int z = 50;
        double v = 3.14159;
        List<Double> lst = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            double res = x + (y - z) * v / (i + 1);
            lst.add(res);
        }

        for (int i = 0; i < lst.size(); i++) {
            double val = lst.get(i);
            System.out.println(val);
        }

        double result = calculate(x, y / 2 * 3);
        System.out.println("Minimum value: " + result);
    }

    private static double calculate(double a, double b) {
        if (a < b) return a;
        return b;
    }

    public static void processNames() {
        int numberOfItemsInTheListThatAreProcessed = 10;
        int baseValueToCalculateWith = 100;
        double constantValueOfPiUsedForCalculations = 3.14159;
        List<Double> listContainingResultsAfterCalculation = new ArrayList<>();

        for (int indexCounterForLoopIteration = 0; indexCounterForLoopIteration < numberOfItemsInTheListThatAreProcessed; indexCounterForLoopIteration++) {
            double resultOfComplexCalculation = baseValueToCalculateWith * constantValueOfPiUsedForCalculations / (indexCounterForLoopIteration + 1);
            listContainingResultsAfterCalculation.add(resultOfComplexCalculation);
        }

        for (int indexCounterForLoopIteration = 0; indexCounterForLoopIteration < listContainingResultsAfterCalculation.size(); indexCounterForLoopIteration++) {
            double valueRetrievedFromList = listContainingResultsAfterCalculation.get(indexCounterForLoopIteration);
            System.out.println("Value: " + valueRetrievedFromList);
        }
    }

}

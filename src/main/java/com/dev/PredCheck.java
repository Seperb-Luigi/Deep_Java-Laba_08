package com.dev;

public class PredCheck {
    public static boolean f(double a, double b) {
        return a < b;
    }

    public static boolean checkPredicate(double[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (!f(a[i], a[i + 1])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        double[] array = {1.0, 2.0, 3.0, 4.0};
        boolean result = checkPredicate(array);
        System.out.println("Усі елементи масиву задовольняють предикату: " + result);
    }
}

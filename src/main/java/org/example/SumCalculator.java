package org.example;

public class SumCalculator {
    public int sum(int n) throws IllegalArgumentException{
        if (n == 0) {
            throw new IllegalArgumentException("Illegal index: " + n);
        }

        int res = 0;
        for (int i = 1; i <= n; i++) {
            res += i;
        }
        return res;
    }

    public static void main(String[] args) {
        SumCalculator calc = new SumCalculator();
        calc.sum(0);
    }
}
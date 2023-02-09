package org.example;

import java.util.stream.IntStream;

public class SumCalculator {
    public int sum(int n) throws IllegalArgumentException {
        if (n == 0) {
            throw new IllegalArgumentException("Illegal index: " + n);
        }
        return IntStream.rangeClosed(1, n).sum();
    }
}
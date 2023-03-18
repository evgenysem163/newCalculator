package com.example.demo;

import org.springframework.stereotype.Service;


@Service
public class CalculatorService {
    public int plus(int numOne, int numTwo) {
        return numOne + numTwo;
    }

    public int minus(int numOne, int numTwo) {
        return numOne - numTwo;
    }

    public int multiply(int numOne, int numTwo) {
        return numOne * numTwo;
    }

    public int divide(int numOne, int numTwo) {
        return numOne / numTwo;
    }

}


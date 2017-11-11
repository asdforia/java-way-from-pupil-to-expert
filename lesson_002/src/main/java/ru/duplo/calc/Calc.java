package ru.duplo.calc;

public class Calc implements ICalc {

    private double result;

    public double getResult() {
        return this.result;
    }

    public void add(double first, double second) {
        this.result = first + second;
    }

    public void sub(double first, double second) {
        this.result = first - second;
    }

    public void mul(double first, double second) {
        this.result = first * second;
    }

    public void div(double first, double second) {
        if (second != 0d) {
            this.result = first / second;
        }
        else {
            throw new ArithmeticException("Could not div by zero!");
        }
    }

    public void resetResult() {
        this.result = 0;
    }
}

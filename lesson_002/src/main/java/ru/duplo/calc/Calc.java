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

    public void exp(double first, int second) {
        double temp = first;
        for(int i = 0; i < second; i++){
            temp *= first;
        }
        this.result = temp;
    }

    public void calc(String operation, double first, double second){
        if(operation.equals("+"))
            this.add(first, second);
        else if(operation.equals("-"))
            this.sub(first, second);
        else if(operation.equals("*"))
            this.mul(first, second);
        else if(operation.equals("/"))
            this.div(first, second);
        else if(operation.equals("^"))
            this.exp(first, (int)second);
        else
            throw new UnsupportedOperationException("+, -, *, /, ^ operation only!");
    }
}

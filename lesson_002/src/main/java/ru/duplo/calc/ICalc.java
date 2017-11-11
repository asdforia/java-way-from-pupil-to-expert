package ru.duplo.calc;

public interface ICalc {
    double getResult();
    void add(double first, double second);
    void sub(double first, double second);
    void mul(double first, double second);
    void div(double first, double second);
    void resetResult();
    //void exp();
}

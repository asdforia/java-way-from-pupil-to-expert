package ru.duplo.calc;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalcTest {
    @Test (expected = ArithmeticException.class)
    public void divExceptionByZero() throws ArithmeticException {
        //assign block
        double first = 30;
        double second = 0;
        Calc calc = new Calc();

        //act block
        calc.div(first, second);
    }

    @Test
    public void add() throws Exception {
        //assign block
        double first = 1;
        double second = 2;
        double expected = 3;
        Calc calc = new Calc();

        //act block
        calc.add(first, second);

        //assert block
        assertEquals(expected, calc.getResult(), 0);
    }

    @Test
    public void sub() throws Exception {
        //assign block
        double first = 1;
        double second = 2;
        double expected = -1;
        Calc calc = new Calc();

        //act block
        calc.sub(first, second);

        //assert block
        assertEquals(expected, calc.getResult(), 0);
    }

    @Test
    public void mul() throws Exception {
        //assign block
        double first = 4;
        double second = 5;
        double expected = 20;
        Calc calc = new Calc();

        //act block
        calc.mul(first, second);

        //assert block
        assertEquals(expected, calc.getResult(), 0);
    }

    @Test
    public void div() throws Exception {
        //assign block
        double first = 30;
        double second = 60;
        double expected = 0.5;
        Calc calc = new Calc();

        //act block
        calc.div(first, second);

        //assert block
        assertEquals(expected, calc.getResult(), 0);
    }

    @Test
    public void resetResult() throws Exception {
        //assign block
        double first = 1;
        double second = 2;
        double expected = 0;
        Calc calc = new Calc();

        //act block
        calc.add(first, second);
        calc.resetResult();

        //assert block
        assertEquals(expected, calc.getResult(), 0);
    }

    @Test
    public void exp() throws Exception {
        //assign block
        double first = 3;
        int second = 3;
        double expected = 27;
        Calc calc = new Calc();

        //act block
        calc.exp(first, second);

        //assert block
        assertEquals(expected, calc.getResult(), 0);
    }

    @Test
    public void calc() throws Exception {
        //assign block
        double first = 1;
        double second = 2;
        String operation = "+";
        double expected = 3;
        Calc calc = new Calc();

        //act block
        calc.calc(operation, first, second);

        //assert block
        assertEquals(expected, calc.getResult(), 0);
    }

}
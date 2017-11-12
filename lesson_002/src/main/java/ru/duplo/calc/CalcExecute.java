package ru.duplo.calc;

public class CalcExecute {

    public static void main(String[] args){
        double a = 25, b = 18, c = 0, d = -225;

        Calc calc = new Calc();

        calc.add(a, b);
        System.out.println(calc.getResult());

        calc.resetResult();
        calc.mul(b, d);
        System.out.println(calc.getResult());

        calc.resetResult();
        try {
            calc.div(b, c);
            System.out.println(calc.getResult());
            calc.resetResult();
        }
        catch (Exception e){
            e.printStackTrace();
        }

        calc.resetResult();
        calc.sub(b, a);
        System.out.println(calc.getResult());

        calc.resetResult();
        calc.exp(225, 4);
        System.out.println(calc.getResult());
    }
}

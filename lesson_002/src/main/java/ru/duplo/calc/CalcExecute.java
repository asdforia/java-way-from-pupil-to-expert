package ru.duplo.calc;

public class CalcExecute {

    private final Calc calc;
    private final double[] argus;

    private CalcExecute(final Calc calc, final double[] args){
        this.calc = calc;
        this.argus = args;
    }

    private void start(){
        double argus [] = this.argus;
        double a = argus[0], b = argus[1], c = argus[2], d = argus[3];

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

    public static void main(String[] args){
        double[] argus = {2.15, 3.16, 0, -2.25};
        new CalcExecute(new Calc(), argus).start();
    }
}

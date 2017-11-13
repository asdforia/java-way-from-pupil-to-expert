package ru.duplo.calc;

/**
 * Консольный калькулятор, операция и аргументы передаются в параметрах
 */
public class ConsoleCalc {
    public static void main(String[] args){
        final Calc calc = new Calc();
        calc.calc(
                args[1],
                Double.valueOf(args[0]),
                Double.valueOf(args[2])
        );
        System.out.println(String.format(
                "%s %s %s = %s",
                args[0], args[1], args[2],
                calc.getResult()
                )
        );
    }
}

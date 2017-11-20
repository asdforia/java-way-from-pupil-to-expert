package ru.duplo.calc;

import java.util.Scanner;

/**
 * Класс для интерактивного калькулятора в консоли
 * @author asdforia
 * @since 2017.11.20
 * @version 1.0
 */
public class InteractRunner {
    private final Calc calc;
    private final IO io;

    InteractRunner(final Calc calc, final IO io){
        this.calc = calc;
        this.io = io;
    }

    public void start() {
        boolean reuse = false;
        try (Validator validator = new Validator(io)) {
            do {
                final double first;
                if (reuse) {
                    first = calc.getResult();
                } else {
                    first = validator.getDouble("Enter first argument: ");
                }

                String operation = validator.getString("Enter operation: ");

                double second = validator.getDouble("Enter second argument: ");

                calc.calc(operation, first, second);

                io.println(
                        String.format("%s %s %s = %s", first, operation, second, calc.getResult())
                );

                reuse = validator.compare("Do you want to reuse result? (y)", "y");

            } while (validator.compare("Do you want to continue? (y)", "y"));
        }
    }

    public static void main(String[] args) {
        new InteractRunner(
                new Calc(),
                new ConsoleIO(new Scanner(System.in), System.out)
        ).start();
    }
}

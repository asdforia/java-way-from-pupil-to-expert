package ru.duplo.calc;

import java.io.Closeable;

public class Validator implements Closeable {

    private final IO io;

    public Validator(final IO io) {
        this.io = io;
    }

    public double getDouble(String message) {
        boolean invalid = false;
        do {
            try {
                this.io.println(message);
                return Double.valueOf(this.io.read());
            } catch (NumberFormatException e) {
                invalid = true;
                System.out.println("Error read of number, Please enter new one. For example: 4 or 2.15 or -7.622");
            }
        } while (invalid);
        throw new UnsupportedOperationException();
    }

    public boolean compare(final String message, final String answer) {
        System.out.println(message);
        return answer.equals(io.read());
    }

    public String getString(String message) {
        System.out.print(message);
        return this.io.read();
    }

    public void close() {
    }
}

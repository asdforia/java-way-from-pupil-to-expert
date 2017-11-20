package ru.duplo.calc;

import java.io.Closeable;

/**
 * Класс декоратор
 * отвечает за корректность вводимых данных
 * @author asdforia
 * @since 2017.11.20
 */

public class Validator implements Closeable {

    private final IO io;

    public Validator(final IO io) {
        this.io = io;
    }

    /**
     * принимает число от пользователя
     * повторяет ввод, пока пользователь не введет корректное число
     * @param message сообщение пользователю
     * @return число double
     */
    public double getDouble(String message) {
        boolean invalid = false;
        do {
            try {
                this.io.println(message);
                return Double.valueOf(this.io.read());
            } catch (NumberFormatException e) {
                invalid = true;
                this.io.println("Error read of number, Please enter new one. For example: 4 or 2.15 or -7.622");
            }
        } while (invalid);
        throw new UnsupportedOperationException();
    }

    /**
     * проверяет ввод пользователя на соответствие ожидаемому
     * @param message сообщение пользователю
     * @param answer ожидаемое сообщение
     * @return истина, если ввод пользователя совпадает с answer, ложь - иначе
     */
    public boolean compare(final String message, final String answer) {
        this.io.println(message);
        return answer.equals(io.read());
    }

    /**
     * получаем строку, введенную пользователем
     * @param message сообщение пользователю
     * @return строку, введенную пользователем
     */
    public String getString(String message) {
        this.io.println(message);
        return this.io.read();
    }

    /**
     * повторяет ввод, пока пользователь не введет корректную операцию
     * @param message message to user
     * @return корректную операцию
     */
    public String getOperation(String message) {
        boolean invalid = false;
        String operation;
        do {
            try {
                this.io.println(message);
                operation = this.io.read();
                if ((operation.equals("+")) ||
                        operation.equals("-") ||
                        operation.equals("*") ||
                        operation.equals("/") ||
                        operation.equals("^"))
                    return operation;
                else
                    throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
                invalid = true;
                this.io.println("Error read of operation, Please enter one from these +, -, *, /, ^");
            }
        } while (invalid);
        throw new UnsupportedOperationException();
    }

    public void close() {
    }
}

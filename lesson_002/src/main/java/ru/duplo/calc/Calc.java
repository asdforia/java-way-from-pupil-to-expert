package ru.duplo.calc;

/**
 * Класс реализует калькулятор
 */
public class Calc implements ICalc {

    /**
     * результат вычислений
     */
    private double result;

    /**
     * получение результата вычислений
     * @return результат
     */
    public double getResult() {
        return this.result;
    }

    /**
     * Сумма
     * @param first первое слагаемое
     * @param second второе слагаемое
     */
    public void add(double first, double second) {
        this.result = first + second;
    }

    /**
     * Разность
     * @param first уменьшаемое
     * @param second вычитаемое
     */
    public void sub(double first, double second) {
        this.result = first - second;
    }

    /**
     * Умножение
     * @param first первый множитель
     * @param second второй множитель
     */
    public void mul(double first, double second) {
        this.result = first * second;
    }

    /**
     * Деление
     * Если делить на нуль - выкинет исключение
     * @param first делимое
     * @param second делитель
     */
    public void div(double first, double second) {
        if (second != 0d) {
            this.result = first / second;
        }
        else {
            throw new ArithmeticException("Could not div by zero!");
        }
    }

    /**
     * Очистка результатов
     */
    public void resetResult() {
        this.result = 0;
    }

    /**
     * Exponentiation
     * @param first base
     * @param second exponent
     */
    public void exp(double first, double second) {
        double temp = first;
        for(int i = 1; i < second; i++){
            temp *= first;
        }
        this.result = temp;
    }

    /**
     * Вычисления на основе выбора конкретной операции
     * Если операция не поддерживается - выкидывает исключение
     * @param operation операция
     * @param first первый аргумент
     * @param second второй аргумент
     */
    void calc(String operation, double first, double second){
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

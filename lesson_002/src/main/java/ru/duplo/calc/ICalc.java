package ru.duplo.calc;
/**
* Описывает калькулятор
* @author asdf@epage.ru
* @since 2017-11-13
*/
public interface ICalc {
    /**
    * Получаем результат
     */
    double getResult();

    /**
    * Сложение
    * @param first первое слагаемое
    * @param second второе слагаемое
     */
    void add(double first, double second);

    /**
     * Вычитание
     * @param first уменьшаемое
     * @param second вычитаемое
     */
    void sub(double first, double second);

    /**
     * Умножение
     * @param first первый множитель
     * @param second второй множитель
     */
    void mul(double first, double second);

    /**
     * Деление
     * @param first делимое
     * @param second делитель
     */
    void div(double first, double second);

    /**
     * Очистка результата
     */
    void resetResult();

    /**
     * Exponentiation
     * @param first base
     * @param second exponent
     */
    void exp(double first, int second);
}

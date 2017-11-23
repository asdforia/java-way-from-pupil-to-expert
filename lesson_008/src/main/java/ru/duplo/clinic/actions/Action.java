package ru.duplo.clinic.actions;

import ru.duplo.clinic.IClinic;
import ru.duplo.calc.Validator;

/**
 * задает шаблон действий программы
 * @author asdforia
 * @since 2017-11-23
 */
public interface Action {
    /**
     * Executed Action
     * @param clinic Clinic
     * @param validator User input validator
     */
    void execute(final IClinic clinic, final Validator validator);

    /**
     * Executed action's description
     * @return Description
     */
    String intro();

    /**
     * Key - action's ID
     * @return Key
     */
    int key();
}
